package com.example.demo.annotation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class MyFormValidatorClass implements ConstraintValidator<MyFormValidator, Object>, Annotation {

    private String values;

    @Override
    public void initialize(MyFormValidator myFormValidator) {
        this.values = myFormValidator.value();
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        if("test".equals((String)values)){
            return true;
        }
        return false;
    }
}
