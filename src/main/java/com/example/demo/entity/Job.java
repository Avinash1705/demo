package com.example.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String location;
    private String profession;
    private double income;
    private int days;

    @Column(name = "work_needed")
    private String workNeeded;

    private String intensive;
    private int experience;

    // Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getWorkNeeded() {
        return workNeeded;
    }

    public void setWorkNeeded(String workNeeded) {
        this.workNeeded = workNeeded;
    }

    public String isIntensive() {
        return intensive;
    }

    public void setIntensive(String intensive) {
        this.intensive = intensive;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
