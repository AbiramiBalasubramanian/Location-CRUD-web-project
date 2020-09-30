package com.abi.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abi.location.entities.Location;
import com.abi.location.repo.LocationRepository;

public interface LocationService {
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getAllLocationById(int id);
	List<Location> getAllLocations();
	LocationRepository getRepository();
	

}

