package com.project.vehicleid.Controller;

import com.project.vehicleid.Model.Vehicle;
import com.project.vehicleid.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/api/v1")
public class VehicleController {

    @Autowired

    private VehicleService vehicleService;


    @GetMapping
    public List<Vehicle> finfAll()
    {
        return vehicleService.findAll();
    }

    @GetMapping("{id}")
    public Vehicle findById(@PathVariable String id) {
                return vehicleService.findById(id);
    }

    @PostMapping
    public  Vehicle createVehicle(@Valid @RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }



    @PutMapping("/{id}")
      public Vehicle updateVehicle(@Valid @RequestBody Vehicle vehicle){
          return vehicleService.save(vehicle);
    }
    @DeleteMapping("/{id}")
      public void deleteVehicleById(@PathVariable String id) {
        vehicleService.deleteVehicleById(id);
    }
}
