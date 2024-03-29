package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MentorDetails;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.MentorDetailsRepository;

@Service
public class MentorDetailsService {
	@Autowired
	private MentorDetailsRepository mdr;
	

	public List<MentorDetails> getMentorDetails(){
		List<MentorDetails> ls=new ArrayList<>();
		mdr.findAll().forEach(ls::add);
		return ls;
	}
	
	public List<MentorDetails> getMentorDetails(String courseName){
		List<MentorDetails> ls=new ArrayList<>();
		ls=mdr.searchMentor(courseName);
		return ls;
	}
	
	public void setMentorDetails(MentorDetails mentorDetails) {
//		String value=mdr.checkUserNameExists(mentorDetails.getUserName());
		boolean exists=mdr.existsById(mentorDetails.getUserName());
		if(exists) {
			System.out.println("exists");
		}else {
		mdr.save(mentorDetails);
		}
	}

}