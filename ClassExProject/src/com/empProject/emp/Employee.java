package com.empProject.emp;

public abstract class Employee {
	String id;
	String name;
	
	public Employee() {}
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	abstract public int getPay();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "사번: " + id + ", 이름: " + name ;
	}
}
