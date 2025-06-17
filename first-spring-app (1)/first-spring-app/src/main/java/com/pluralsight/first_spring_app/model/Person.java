package com.pluralsight.first_spring_app.model;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, int age, String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
