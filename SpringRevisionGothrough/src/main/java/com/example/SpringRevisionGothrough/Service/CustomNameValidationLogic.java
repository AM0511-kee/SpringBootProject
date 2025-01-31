package com.example.SpringRevisionGothrough.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.SpringRevisionGothrough.Dto.ControllerDto;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CustomNameValidationLogic implements ConstraintValidator<StartsWith, ControllerDto> {

	Logger log = LoggerFactory.getLogger(getClass());

	public void initialize(StartsWith constraintAnnotation) {
	}

	@Override
	public boolean isValid(ControllerDto value, ConstraintValidatorContext context) {
		log.info("inside isvalid method");
		return value.getName().startsWith("A") && value.getNumber() > 0;
	}

}
