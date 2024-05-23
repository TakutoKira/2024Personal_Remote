package com.example.demo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanetResponce implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private int distance;
	private String image;

}