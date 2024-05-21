package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MainController {
	@GetMapping("/api")
	@ResponseBody
	public PlanetData getPlanet() {
		PlanetData planet = new PlanetData();
		planet.setName("name");
		planet.setDistance(0);
		return planet;
	}
}
