package com.example.demo.annotation;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER,ElementType.FIELD})
@Constraint(validatedBy = MyFormValidatorClass.class)
public @interface MyFormValidator {
    String value();
    String message() default "name can be test";
    Class<?>[] groups() default {};
}
