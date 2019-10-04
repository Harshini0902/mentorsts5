package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserDetails;
import com.example.demo.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository udr;
	
	public List<UserDetails> getUserDetails(){
		List<UserDetails> ls=new ArrayList<>();
		udr.findAll().forEach(ls::add);
		return ls;
	}
	public void setUserDetails(UserDetails userDetails) {
		udr.save(userDetails);
	}

}
