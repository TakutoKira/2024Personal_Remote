package com.example.demo;

import java.io.Serializable;

import lombok.Data;

@Data
public class PlanetData implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int distance;
}
