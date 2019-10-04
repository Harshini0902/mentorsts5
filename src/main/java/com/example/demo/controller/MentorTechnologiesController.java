package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.MentorTechnologies;
import com.example.demo.service.MentorTechnologyService;

@RestController
public class MentorTechnologiesController {
	@Autowired
	private MentorTechnologyService mentorTechnologyService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/mentortechnology/{userName}")
	public void addMentorTechnology(@RequestBody MentorTechnologies mentorTechnologies,@PathVariable String userName) {
		mentorTechnologyService.setMentorTechnologies(mentorTechnologies,userName);
}
}
