package com.in3des.springlesson.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    @NotEmpty(message = "Name field should not be blank")
    @Size(min = 2, max = 30, message = "Please correct name size")
    private String name;

    @Column(name = "surname", nullable = false)
    @NotEmpty(message = "Surname field should not be blank")
    @Size(min = 2, max = 30, message = "Please correct surname size")
    private String surname;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be a positive value")
    private int age;

    public Person() {}

//    public Person(int id, String name, String surname, int age) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }

//    public Person(String name, String surname, int age) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}