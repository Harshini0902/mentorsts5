package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="trainings")
public class Trainings {
	@Id
	private int trainingNum;
	private String trainingName;
	private String status;
	public int getTrainingNum() {
		return trainingNum;
	}
	public void setTrainingNum(int trainingNum) {
		this.trainingNum = trainingNum;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
