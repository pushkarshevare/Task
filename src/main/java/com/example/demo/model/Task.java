package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {

	@Id
	private int taskId;
	private String Description;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int taskId, String description) {
		super();
		this.taskId = taskId;
		Description = description;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", Description=" + Description + "]";
	}
	
	
}
