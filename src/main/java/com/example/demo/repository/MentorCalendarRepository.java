package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.MentorCalendar;



public interface MentorCalendarRepository  extends CrudRepository<MentorCalendar,String>{
//	@Transactional
//	@Modifying
//	@Query(value="update mentor_details set calendar_num=?1 where user_name=?2",nativeQuery=true)
//	void setCalendarNums(int calendarNum, String userName);
	
	

	
}
