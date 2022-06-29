package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ShoeRepository extends JpaRepository<Shoes, Integer> {
	
/*	@Query("select size from Shoes where Shoes.id=?1") 
	public String getSize(int id);
	
	@Query("select sprice from Shoes where Shoes.id=?1") 
	public String getPrice(int id);
	
	@Query("select stype from Shoes where Shoes.id=?1") 
	public String getType(int id);
*/
}
