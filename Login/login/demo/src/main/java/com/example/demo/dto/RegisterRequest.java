package com.example.demo.dto;

public class RegisterRequest {
    private String fullName;
    private String email;
    private String phoneNumber;
    private int age;
    private String gender;
    private String city;
    private String password;

    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCity() { return city; }
    public String getPassword() { return password; }
}
