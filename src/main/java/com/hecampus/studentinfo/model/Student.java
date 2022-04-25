package com.hecampus.studentinfo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Document
public class Student {

    @Id
    private String id;

  @NotBlank(message = "{com.hecampus.validation.firstname}")
  private String firstName;

    @NotBlank(message = "{com.hecampus.validation.lastname}")
    private String lastName;

    @NotBlank (message = "{com.hecampus.validation.phonenember}")
    @Size(min=0,max=10)
    private String phoneNumber;

    @NotBlank(message = "{com.hecampus.validation.email}")
    @Email
    private String email;

    public Student() {
    }

    public Student(String id, String firstName, String lastName, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
