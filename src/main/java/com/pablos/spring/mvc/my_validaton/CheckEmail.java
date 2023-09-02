package com.pablos.spring.mvc.my_validaton;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // Будем аннотировать поле класса
@Retention(RetentionPolicy.RUNTIME) // Информация об аннотации сохраняется до выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class) // В каком классе лежит логика валидатора
public @interface CheckEmail { // Это просто флаг, вся логика в CheckEmailValidator

    public String value() default ".ru"; // Описываем аргументы, которые будут указываться после аннотации

    public String message() default "Only .ru mail domains accepted!"; // --*--

    public Class<?>[] groups() default {}; // Я ХЗ что это - просто так надо

    public Class<? extends Payload>[] payload() default {}; // Я ХЗ что это - просто так надо

}
