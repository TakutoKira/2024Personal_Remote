package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Autowired
	PlanetRepository planet;

	@Override
	public void run(String... args) throws Exception {
		planet.save(new Planet("Earth", 0));
		planet.save(new Planet("Moon", 30));
		planet.save(new Planet("Mars", 783));
		for (Planet pl : planet.findAll()) {
			System.out.println(pl.getName());
		}
	}
}