package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface BuyRepo extends JpaRepository<Buy, Integer> {
	
	@Query("select count(*) from Buy")
	public int byCount();
		
	

}
