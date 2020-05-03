package com.project.vehicleid.Service;

import com.project.vehicleid.Model.Vehicle;
import com.project.vehicleid.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service

public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> findAll()
    {
        return vehicleRepository.findAll();
    }

    public Vehicle findById(String id){
        return vehicleRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException:: new);
    }

    public  Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

        public void deleteVehicleById(String id) {
                vehicleRepository.deleteById(id);
    }
}
