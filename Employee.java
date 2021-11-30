package com.example.xmlbased;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", project=" + project + ", dependants="
				+ dependants + "]";
	}

	private String name;
	private String designation;
	private Project project;
	private List<String> dependants;

	public Employee() {

	}

	public Employee(String name, String designation, Project project, List<String> dependants) {
		super();
		this.name = name;
		this.designation = designation;
		this.project = project;
		this.dependants = dependants;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<String> getDependants() {
		return dependants;
	}

	public void setDependants(List<String> dependants) {
		this.dependants = dependants;
	}

	public void customInitMethod() {
		System.out.println("Inside custom Init method");
	}

	public void customDestroyMethod() {
		System.out.println("Inside Destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

}
