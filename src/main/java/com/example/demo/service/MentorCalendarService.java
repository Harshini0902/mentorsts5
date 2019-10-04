package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MentorCalendar;
import com.example.demo.model.MentorDetails;
import com.example.demo.repository.MentorCalendarRepository;
import com.example.demo.repository.MentorDetailsRepository;

@Service
public class MentorCalendarService {
	@Autowired
	private MentorCalendarRepository mcr;
	@Autowired
	private MentorDetailsRepository mdr;


	public void setMentorCalendar(MentorCalendar mentorCalendar,String userName) {
		mcr.save(mentorCalendar);
		List<MentorDetails> mentorDetailsList=new ArrayList<MentorDetails>();
		MentorDetails mentorDetails=new MentorDetails();
		mentorDetails=mdr.findById(userName).get();
		mentorDetails.setMentorCalendar(mentorCalendar);
		mentorDetailsList.add(mentorDetails);
		mentorCalendar.setMentorDetailsList(mentorDetailsList);
		mdr.save(mentorDetails);

		
}
}