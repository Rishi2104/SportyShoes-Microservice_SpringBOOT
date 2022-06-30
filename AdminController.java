package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
@Autowired
	Admindao dao;

Logger log=Logger.getAnonymousLogger();
@ResponseBody
@RequestMapping("/register-user/{suser}/{spassword}/{semail}")
public String registermicroservice(HttpServletRequest req,HttpServletResponse res,@PathVariable("suser") String suser,@PathVariable("spassword") String spassword,@PathVariable("semail") String semail)
{
	log.info("in get all request");
	//ModelAndView mv=new ModelAndView();
	Admin Admin =new Admin();
	Admin.setSuser(suser);
	Admin.setSpassword(spassword);
	Admin.setSemail(semail);
	 log.info("values set");
	 log.info(Admin.getSuser()+"   "+Admin.getSpassword()+"   "+Admin.getSemail());
	 
	 Admin ss=dao.insert(Admin);
	 if(ss!=null) {
		 log.info("Successfully registered.");
		 return "Successful";
	 }
	 else {
		 log.info("Failed registeration");
		 return "failed";
	 }
}
	
}

