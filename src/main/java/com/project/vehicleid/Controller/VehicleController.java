package com.project.vehicleid.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class VehicleController {
    @GetMapping("/vehicle")
    public list <vehicle> getAllVehicles() {
        return userRepository.findAll();
    }
}