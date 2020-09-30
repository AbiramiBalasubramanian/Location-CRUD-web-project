package com.abi.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abi.location.entities.Location;
import com.abi.location.repo.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired	
	private LocationRepository repository;


	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	public Location getAllLocationById(int id) {
		return repository.findById(id).orElse(null);
	}

	public List<Location> getAllLocations() {
		return repository.findAll();
	}
	
	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

}
