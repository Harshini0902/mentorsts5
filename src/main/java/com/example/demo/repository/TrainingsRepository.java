package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.MentorCalendar;
import com.example.demo.model.Trainings;

public interface TrainingsRepository  extends CrudRepository<Trainings,String> {

	@Query(value="select userName from MentorDetails")
	List<String> getMentorNameList();
}
