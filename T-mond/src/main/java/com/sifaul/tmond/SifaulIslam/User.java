package com.sifaul.tmond.SifaulIslam;

public class User {
    private final String username ;
    private String password, dateofbirth, email, address , role, gender ;
    private int phone_number;

    public User(String username, String password, String dateofbirth, String email, String address, String role, String gender, int phone_number) {
        this.username = username;
        this.password = password;
        this.dateofbirth = dateofbirth;
        this.email = email;
        this.address = address;
        this.role = role;
        this.gender = gender;
        this.phone_number = phone_number;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                ", gender='" + gender + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
