package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.UserDetails;


public interface UserDetailsRepository extends CrudRepository<UserDetails,String>{

}
