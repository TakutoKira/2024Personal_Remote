package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "*")
public class MainController {
	PlanetRepository planet;

	@GetMapping("/")
	@ResponseBody
	public String getIndex() {
		return "index.html";
	}
}
