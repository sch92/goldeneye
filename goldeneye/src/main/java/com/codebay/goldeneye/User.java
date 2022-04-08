package com.codebay.goldeneye;


public class User {
    private String name;
    private String surname;
    private String office;
    private String department;

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

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        String email = this.name.toLowerCase().charAt(0) + this.surname.toLowerCase() + "." + this.department.toLowerCase()+ "@" + this.office.toLowerCase() + "." + "goldeneye.com";
        
        return email;
    }
}