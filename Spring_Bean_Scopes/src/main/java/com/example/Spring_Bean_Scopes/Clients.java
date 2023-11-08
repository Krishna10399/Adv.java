package com.example.Spring_Bean_Scopes;

public class Clients {
	String name;
	int age;
	String city;
	public Clients(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public void Clients1(String name, int age, String city) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	}
