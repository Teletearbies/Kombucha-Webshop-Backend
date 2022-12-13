package com.example.kombuchawebshopbackend.Dtos;

public class LoginOutcomeDTO {

    private String username;
    private int status;

    public LoginOutcomeDTO(String username, int status) {
        this.username = username;
        this.status = status;
    }

    public LoginOutcomeDTO(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
