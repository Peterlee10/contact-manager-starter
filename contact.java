package com.programming.techie;
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void validateFirstName() {
        if (this.firstName.isBlank())
            throw new RuntimeExecption("First Name Cannot be null or empty");
    }

    public void validateLastName() {
        if (this. lastName.isBlank())
            throw new RuntimeExecption("Last Name Cannot be null or rmpty");
    }

    public void validatephoneNumber() {
        if (this. phoneNumber.isBlank()) {
            throw new RuntimeExecption("phone Number Cannot br null or empty");
        }

        if (this.phoneNumber.length() !=10) {
            throw new RuntimeExecption("Phone Number Should be 10 Digits Long");
        }
        if (!this.phoneNumber.matches("\\d+")) {
            throw new RuntimeExecption("Phone Number Contain only digits");
        }
        if (!this.phoneNumber.startsWith("0")) {
            throw new RuntimeExecption("Phone Number Should Start with 0");
        }
    }
}