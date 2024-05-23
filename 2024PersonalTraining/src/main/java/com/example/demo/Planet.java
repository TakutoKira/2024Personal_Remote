package com.example.demo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Planet implements Serializable {
	public Planet(String string, int i) {
		// TODO 自動生成されたコンストラクター・スタブ
		name = string;
		distance = i;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private int distance;

}
