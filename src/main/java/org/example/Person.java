package org.example;

import java.util.Objects;

public class Person {
    private String surname;
    private int age;

    public Person(String surname, int age) {  // constructor
        if (surname.length() < 2)
            throw new IllegalArgumentException("Surname cannot be less than two liters");

        if (age < 0)
            throw new IllegalArgumentException("Age cannot be less than 0 years");

        this.surname = surname;
        this.age = age;
    }

    // getter
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    // setter
    public void setSurname(String surname) {
        if (surname.length() < 2)
            throw new IllegalArgumentException("Surname cannot be of two liters");

        this.surname = surname;
    }

    public void setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be less than 0");

        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(surname, person.surname);
    }
}
