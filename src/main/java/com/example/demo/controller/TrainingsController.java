package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Trainings;
import com.example.demo.service.TrainingsService;



@RestController
public class TrainingsController {
	@Autowired
	private TrainingsService trainingsService;

	

	@RequestMapping(method = RequestMethod.POST, value = "/trainings/{userName}")
	public void addTrainings(@RequestBody Trainings trainings,@PathVariable String userName) {
		trainingsService.setTrainings(trainings,userName);
	}
}
