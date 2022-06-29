package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Adminrepo extends JpaRepository<Admin, String> {

	@Query("select Admin from Admin Admin where Admin.suser=?1")
	public Admin findByuser(String user);
	
	@Query("select Admin from Admin Admin where Admin.spassword=?1")
	public Admin findBypassword(String password);
	
}