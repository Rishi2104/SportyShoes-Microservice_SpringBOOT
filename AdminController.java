package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class AdminController {
@Autowired
	Admindao dao;

Logger log=Logger.getAnonymousLogger();
@ResponseBody
@RequestMapping("/login")
public String login(HttpServletRequest req,HttpServletResponse res,@RequestParam("suser") String suser,@RequestParam("spassword") String spassword) {
	
	log.info("inside the request mapping of login");
	log.info("object from user"+dao.findbyuser(suser));
	log.info("object from password"+dao.findbypassword(spassword));
	if(dao.findbyuser(suser)==null)
	{
		log.info("-------NULL value CAUGHT....");
		return " User does not Exist.";
	}
	else if(dao.findbyuser(suser).equals(dao.findbypassword(spassword))) {
		log.info("validation of the user is successfull");
		return "Login is successfull";
	}
	else {
		log.info("failed");
	return "login failed ! check the credentials or register first";
	}
	
}
@ResponseBody
@RequestMapping("/register")
public String register(HttpServletRequest req,HttpServletResponse res)
{
	
	log.info("into the register mapping");
	String suser=req.getParameter("suser");
	String spassword=req.getParameter("spassword");
	String semail=req.getParameter("semail");
	log.info("data set");
	RestTemplate rest=new RestTemplate();
	String url="http://localhost:8082/register-user/"+suser+"/"+spassword+"/"+semail;
	log.info(url);
	rest.getForObject(url,String.class);
	log.info("went to register ms");
	return "success";
}
	
}

