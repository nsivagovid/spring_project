package com.example.spring_project;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
public class Employee {

    // Constructors, Getters, Setters, and toString()

    public Employee() {}


    private String empDetails;

    public Employee(String empDetails, String name, String firstName, String lastName, String department, double salary, String id) {
        this.empDetails = empDetails;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    private String name;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;
    @Id
    private String id;




    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpDetails() {
        return empDetails;
    }

    public void setEmpDetails(String empDetails) {
        this.empDetails = empDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }










}
