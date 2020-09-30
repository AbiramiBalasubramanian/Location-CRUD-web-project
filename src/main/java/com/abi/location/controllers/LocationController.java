package com.abi.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abi.location.entities.Location;
import com.abi.location.service.LocationService;

@Controller
public class LocationController {
	@Autowired
	private LocationService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/savLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location Locationsaved = service.saveLocation(location);
		String msg = "The Location is saved for the id:"+Locationsaved.getId();
		modelMap.addAttribute("msg",msg);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations",locations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id")int id,ModelMap modelMap) {
		Location location = service.getAllLocationById(id);
		service.deleteLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations",locations);
		return "displayLocations";
	}
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id")int id,ModelMap modelMap) {
		Location location = service.getAllLocationById(id);
		modelMap.addAttribute("location",location);
		return "updateLocation";
	}
	
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
	service.updateLocation(location);
	List<Location> locations = service.getAllLocations();
	modelMap.addAttribute("locations",locations);
		return "displayLocations";
	}
}
