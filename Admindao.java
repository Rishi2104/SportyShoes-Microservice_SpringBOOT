package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Admindao {
	@Autowired
	Adminrepo repo;

	public Admin findbyuser(String user) {
		return repo.findByuser(user);
	}
	
	
	public Admin findbypassword(String password) {
		return repo.findBypassword(password);
	}
	
}
