package com.example.demo.model;

public class UserResponse {
    private Long id;
    private String username;
    private String phone;

    public UserResponse(Long id, String username, String phone) {
        this.id = id;
        this.username = username;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
