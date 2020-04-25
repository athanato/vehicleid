package com.project.vehicleid.Controller;

import com.project.vehicleid.Model.Vehicle;
import com.project.vehicleid.Repository.VehicleRepository;
import com.project.vehicleid.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/api/v1")
public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping("/vehicle")
    public java.util.List<Vehicle> getAllVehicles()
    {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

    @GetMapping("/vehicles/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable(value = "id") Long vehicleId)
        throws ResourceNotFoundException {
        Vehicle vehicle = vehicleRepository
                .findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found on : " + vehicleId));
                return ResponseEntity.ok().body(vehicle);
    }

@PostMapping("/vehicles")
    public  Vehicle createVehicle(@Valid @RequestBody Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
}

@PutMapping("/vehicles/{id}")
    public ResponseEntity<Vehicle> updateVehicle(
            @PathVariable(value = "id") Long vehicleId, @Valid @RequestBody Vehicle vehicleDetails)
    throws ResourceNotFoundException {
    Vehicle vehicle = vehicleRepository
            .findById(vehicleId)
            .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found on : " + vehicleId));

    vehicle.setModelName(vehicleDetails.getModelName());
    vehicle.setUpdatedAt(new Date());
    final Vehicle updatedVehicle = vehicleRepository.save(vehicle);
    return ResponseEntity.ok(updatedVehicle);
}
        @DeleteMapping("/vehicle/{id}")
                public Map<String, Boolean> deleteVehicle(@PathVariable(value = "id") Long vehicleId) throws Exception {
        Vehicle vehicle =
                vehicleRepository
                        .findById(vehicleId)
                        .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found : " + vehicleId));

        vehicleRepository.delete(vehicle);
        Map<String, Boolean> responce = new HashMap<>();
        responce.put("deleted", Boolean.TRUE);
        return responce;

    }
}
