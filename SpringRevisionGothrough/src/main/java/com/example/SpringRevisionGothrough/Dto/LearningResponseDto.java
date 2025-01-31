package com.example.SpringRevisionGothrough.Dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@JsonFilter("filterSample")
public class LearningResponseDto {

	@JsonProperty("Response_name")
	private String name;

	public LearningResponseDto() {
		super();

	}

	@JsonProperty("Response_number")
	private Integer number;

	public LearningResponseDto(String name, Integer number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
