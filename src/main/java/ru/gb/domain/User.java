package ru.gb.domain;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String Name;
    private int age;

    public User() {

    }

    public User(int id, String name, int age) {
        this.id = id;
        Name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(Name, user.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, age);
    }
}
