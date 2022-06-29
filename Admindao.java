package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Admindao {
	@Autowired
	Adminrepo repo;
	@Autowired
	ShoeRepository repo1;
	@Autowired
	BuyRepo br;
	
	public Admin findbyuser(String user) {
		return repo.findByuser(user);
	}
	
	
	public Admin findbypassword(String password) {
		return repo.findBypassword(password);
	}
	
	public List<Shoes> getall(){
		return repo1.findAll();
	}


	public Shoes insert(Shoes s) {
		Logger log=Logger.getAnonymousLogger();
		log.info("Inside Insert ");
		return repo1.save(s);
	}


	public Buy buy(Buy s) {
		return br.save(s);
	}
	public int byCount() {
		return br.byCount();
	}
	
/*	public String getSize(int id) {
		return repo1.getSize(id);
	}
	public String getPrice(int id) {
		return repo1.getSize(id);
	}
	public String getType(int id) {
		return repo1.getSize(id);
	}
	public List<Buy> getBuy(){
		return br.findAll();
	}
	*/
}
