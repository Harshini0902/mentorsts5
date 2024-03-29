package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserDetails;
import com.example.demo.service.UserDetailsService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/userdetailsapi")
public class UserDetailsController {
	@Autowired
	private UserDetailsService userDetailsService;

	@RequestMapping("/userdetails")
	public List<UserDetails> getUserDetails(){
		return userDetailsService.getUserDetails();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/userdetails")
	public void addUserDetails(@RequestBody UserDetails userDetails) {
		userDetailsService.setUserDetails(userDetails);
	}
}
