package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class PlanetController {

	@Autowired
	PlanetRepository planetRepo;

	@GetMapping("/api")
	@ResponseBody
	public List<Planet> getPlanet() {
		List<Planet> planet = planetRepo.findAll();
		return planet;
	}
}
