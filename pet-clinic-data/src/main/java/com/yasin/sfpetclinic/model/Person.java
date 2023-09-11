package com.yasin.sfpetclinic.model;

public class Person extends BaseEntity{

    private String firstName;
    private String lastName;
    private Long Id;


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
}
