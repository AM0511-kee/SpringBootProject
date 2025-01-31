package com.example.SpringRevisionGothrough.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRevisionGothrough.Dto.ControllerDto;
import com.example.SpringRevisionGothrough.Dto.LearningResponseDto;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import jakarta.validation.Valid;

@RestController
public class LearningController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	private ApplicationPropertiesConfigurationClass applicationProp;

	@Autowired
	public LearningController(ApplicationPropertiesConfigurationClass applicationProp) {
		super();
		this.applicationProp = applicationProp;
	}

	@PostMapping("ValidationCheck")
	public MappingJacksonValue configurationProp(@Valid @RequestBody ControllerDto dto) {

		String name = applicationProp.getName();
		LearningResponseDto responseDto = new LearningResponseDto(name, dto.getNumber());
		MappingJacksonValue value = new MappingJacksonValue(responseDto);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("Response_name");
		SimpleFilterProvider filters = new SimpleFilterProvider().addFilter("filterSample", filter);
		value.setFilters(filters);
		logger.debug("inside configurationProp");
		return value;
		// return new ResponseEntity<>(dto.getName(), HttpStatus.OK);

	}

	/*
	 * C:\Users\2146271\Downloads\SpringRevisionGothrough\SpringRevisionGothrough\
	 * target \SpringRevisionGothrough-0.0.1-SNAPSHOT.jar8
	 */

}
