package com.example.demo.model;

public class UserModel {
    public static String ADMIN = "ADMIN";
    public static String STUDENT = "STUDENT";
    public static String TEACHER = "TEACHER";

    private String email;
    private String role;
    private String name;

    public UserModel(String email, String role, String name) {
        this.email = email;
        this.role = role;
        this.name = name;
    }

    public UserModel() {
    }

    public boolean isAdmin(){
        return role.equals(ADMIN);
    }

    public boolean isStudent(){
        return role.equals(STUDENT);
    }

    public boolean isTeacher(){
        return role.equals(TEACHER);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
