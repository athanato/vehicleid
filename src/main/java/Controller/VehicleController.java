package Controller;

import Model.Vehicle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
@RequestMapping ("/")
public class VehicleController {
    @GetMapping("/vehicle")
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

@GetMapping("/vehicle/{id}")
    public ResponseEntity<Vehicle> getVehiclesById(@PathVariable(value = "id") Long vehicleId)
        throws ResourceNotFoundException {
        Vehicle vehicle =
                vehicleRepository
                        .findById(vehicleId)
                        .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found on :: " + vehicleId));
        return ResponseEntity.ok().body(vehicle);
    }
}
