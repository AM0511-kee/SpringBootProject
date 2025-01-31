package com.example.SpringRevisionGothrough.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = CustomNameValidationLogic.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface StartsWith {

	String message() default "Check the dto properly";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
