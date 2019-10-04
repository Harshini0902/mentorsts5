package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MentorDetails;
import com.example.demo.model.Trainings;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.MentorDetailsRepository;
import com.example.demo.repository.TrainingsRepository;
import com.example.demo.repository.UserDetailsRepository;

@Service
public class TrainingsService {
	@Autowired
	private TrainingsRepository tr;
	@Autowired
	private MentorDetailsRepository mdr;
	@Autowired
	private UserDetailsRepository udr;
	
	public void setTrainings(Trainings trainings,String userName) {
		
		List<String> mentorNameList=tr.getMentorNameList();
		if(mentorNameList.contains(userName)) {
		MentorDetails mentorDetails=new MentorDetails();
		mentorDetails=mdr.findById(userName).get();
		
		List<Trainings> oldList = mentorDetails.getTrainings();
		oldList.add(trainings);
		mentorDetails.setTrainings(oldList);

		tr.save(trainings);
		mdr.save(mentorDetails);
	}else {
		UserDetails userDetails=new UserDetails();
		userDetails=udr.findById(userName).get();
		
		List<Trainings> oldList = userDetails.getTrainings();
		oldList.add(trainings);
		userDetails.setTrainings(oldList);

		tr.save(trainings);
		udr.save(userDetails);
	}
}
}
