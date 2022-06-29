package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Shoes {
	@Id
	private int id;
	private String size;
	private String sprice;
	private String stype;

}
