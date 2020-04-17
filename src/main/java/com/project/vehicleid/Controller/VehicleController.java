package com.project.vehicleid.Controller;

import com.project.vehicleid.Model.Vehicle;
import com.project.vehicleid.Repository.VehicleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class VehicleController {
    @GetMapping("/vehicle")
    public list <Vehicle> getAllVehicles() {
        return VehicleRepository.findAll();
    }
}
