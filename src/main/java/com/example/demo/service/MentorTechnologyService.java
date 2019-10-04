package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MentorDetails;
import com.example.demo.model.MentorTechnologies;
import com.example.demo.model.Trainings;
import com.example.demo.repository.MentorDetailsRepository;
import com.example.demo.repository.MentorTechnologiesRepository;

@Service
public class MentorTechnologyService {
	@Autowired
	private MentorTechnologiesRepository mtr;
	@Autowired
	private MentorDetailsRepository mdr;
	
	public void setMentorTechnologies(MentorTechnologies mentorTechnologies,String userName) {
//		String value=mtr.checkUserNameInMentor(userName);
//		System.out.println("value:"+value);
//		if(!value.equals("null")) {
//			mtr.save(mentorTechnologies);
//			
////		int skillId=mentorTechnologies.getSkillId();
////		mtr.setMentorNames(skillId,userName);
		MentorDetails mentorDetails=new MentorDetails();
		mentorDetails=mdr.findById(userName).get();
		
		List<MentorTechnologies> oldList = mentorDetails.getMentorTechnologies();
		oldList.add(mentorTechnologies);
		mentorDetails.setMentorTechnologies(oldList);

		mtr.save(mentorTechnologies);
		mdr.save(mentorDetails);
	
	}
		
}
