package com.pablos.spring.mvc.my_validaton;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CheckEmailValidator
        implements ConstraintValidator<CheckEmail, String> { // Аннотация будет применяться к полю email в Employee, а оно класса String
   private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value(); // Получаем контрольное значение
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext context) {
        return enteredValue.endsWith(endOfEmail);
    }
}
