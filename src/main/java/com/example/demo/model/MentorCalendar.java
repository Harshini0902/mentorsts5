package com.example.demo.model;

import java.sql.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mentor_calendar")
public class MentorCalendar {
	@Id @GeneratedValue
	private int calendarNum;
	private Date startDate;
	private Date endDate;
	
	public int getCalendarNum() {
		return calendarNum;
	}
	public void setCalendarNum(int calendarNum) {
		this.calendarNum = calendarNum;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@OneToMany(mappedBy="mentorCalendar",cascade=CascadeType.ALL)
	
	private List<MentorDetails> mentorDetailsList;

	public List<MentorDetails> getMentorDetailsList() {
		return mentorDetailsList;
	}
	public void setMentorDetailsList(List<MentorDetails> mentorDetailsList) {
		this.mentorDetailsList = mentorDetailsList;
	}
	

}
