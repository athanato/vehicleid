package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class VehicleController {
    @GetMapping("/vehicle")
    public List<vehicle> getAllVehicles() {
        return userRepository.findAll();
    }

@GetMapping("/vehicle/{id}")
    public ResponseEntity<vehicle> getVehiclesById(@PathVariable(value = "id") Long vehicleId)
        throws ResourceNotFoundException {
        Vehicle vehicle =
                vehicleRepository
                        .findById(vehicleId)
                        .orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + vehicleId));
        return ResponseEntity.ok().body(vehicle);
    }
}
