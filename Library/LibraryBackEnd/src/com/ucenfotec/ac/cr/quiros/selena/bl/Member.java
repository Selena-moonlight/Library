package com.ucenfotec.ac.cr.quiros.selena.bl;

import java.time.LocalDate;

public class Member {
    private String name;
    private String email;
    private Role role;
    private LocalDate birthdate;
    private String address;
    private Gender gender;
    private String password;
    private int id;

    public Member() {
    }

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.birthdate = birthdate;
        this.address = address;
        this.gender = gender;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }

    public void add(Member member) {
    }
}
