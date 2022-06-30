package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Admindao {
	@Autowired
	Adminrepo repo;

	public Admin insert(Admin s) {
		return repo.save(s);
	}
	
}
