package com.example.SpringRevisionGothrough.Dto;

import com.example.SpringRevisionGothrough.Service.StartsWith;

@StartsWith
public class ControllerDto {

	private String name;

	private Integer number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ControllerDto() {
		super();
	}

	public ControllerDto(String name, Integer number) {
		super();
		this.name = name;
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
