package com.example.SpringRevisionGothrough.Dto;

public class EmployeeDto  {

	private String name;

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public EmployeeDto(String name, Integer rating) {
		super();
		this.name = name;
		this.rating = rating;
	}



}
