package com.example.xmlbased;

public class Project {
	
	@Override
	public String toString() {
		return "Project [name=" + name + ", duration=" + duration + "]";
	}

	private String name;
	private String duration;
	
	public Project() {
		System.out.println("Project default constructor called");
	}

	public Project(String name, String duration) {
		super();
		this.name = name;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}
