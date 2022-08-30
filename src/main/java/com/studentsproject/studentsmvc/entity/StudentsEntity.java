package com.studentsproject.studentsmvc.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@ToString
@Entity
@Table(name = "students", schema = "VyDB")
public class StudentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "email", nullable = true, length = 255)
    private String email;
    @Basic
    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = true, length = 255)
    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StudentsEntity() {
    }

    public StudentsEntity(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
