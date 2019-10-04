package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.demo.model.MentorTechnologies;

public interface MentorTechnologiesRepository extends CrudRepository<MentorTechnologies,String> {
//	@Transactional
//	@Modifying
//	@Query(value="update mentor_technologies set mentor_name=?2 where s_no=?1 ",nativeQuery=true)
//	void setMentorNames(int sNo,String userName);
	
//	@Query(value="select user_name from mentor_details where user_name=?1",nativeQuery=true)
//	String checkUserNameInMentor(String userName);

}
