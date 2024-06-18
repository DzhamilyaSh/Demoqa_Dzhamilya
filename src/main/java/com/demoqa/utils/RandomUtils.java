package com.demoqa.utils;

import com.demoqa.entities.Employee;
import com.demoqa.entities.PracticeFormEntity;
import com.demoqa.entities.TextBoxEntity;
import com.github.javafaker.Faker;

public class RandomUtils {

    Faker faker = new Faker();
    public TextBoxEntity generaterandomTextBoxEntity(){
        TextBoxEntity textBoxEntity = new TextBoxEntity();
        textBoxEntity.setFullName(faker.name().fullName());
        textBoxEntity.setEmail(faker.internet().emailAddress());
        textBoxEntity.setCurrentAddress(faker.address().fullAddress());
        textBoxEntity.setPermanentAddress(faker.address().secondaryAddress());
        return textBoxEntity;
    }

    public PracticeFormEntity generaterandomPracticeFormEntity(){
        PracticeFormEntity practiceFormEntity = new PracticeFormEntity();
        practiceFormEntity.setFirstName(faker.name().firstName());
        practiceFormEntity.setLastName(faker.name().lastName());
        practiceFormEntity.setEmail(faker.internet().emailAddress());
//        practiceFormEntity.setGenders(faker.);
        practiceFormEntity.setMobile(faker.phoneNumber().subscriberNumber(10));
        practiceFormEntity.setCurrentAddress(faker.address().fullAddress());
//        practiceFormEntity.setSubjects(faker.random().toString());
        practiceFormEntity.setState("NCR");
        practiceFormEntity.setCity("Delhi");

        return practiceFormEntity;
    }

    public Employee creatMocEmployee(){
        Employee employee = new Employee();
        employee.setFirstname(faker.name().firstName());
        employee.setLastname(faker.name().lastName());
        employee.setAge(faker.number().numberBetween(18,100)); //-> МЕТОД ГЕНЕРИРУЕТ ОТ 18 ДО 100))
        employee.setEmail(faker.internet().emailAddress());
        employee.setSalary(faker.number().numberBetween(10000000l,2000000000l));
        employee.setDepartment(faker.job().position());
        return employee;
    }

}
