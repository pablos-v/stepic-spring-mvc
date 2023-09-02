package com.pablos.spring.mvc;

import com.pablos.spring.mvc.my_validaton.CheckEmail;
import jakarta.validation.constraints.*;

public class Employee {
    @Size(min = 3, max = 50, message = "name must be 2 to 50 symbols")
    private String name;
    @NotEmpty
    private String surname;
    @Min(value = 500)
    @Max(value = 1200)
    private int salary;
    private String department;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}", message = "use pattern 111-111-11")
    private String phone;
    @CheckEmail
    private String email;

    private String os;
    private String[] langs;

    public String[] getLangs() {
        return langs;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLangs(String[] langs) {
        this.langs = langs;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
