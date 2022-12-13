package com.example.kombuchawebshopbackend;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        //bcrypt
        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();

        //admin --> admin
        //user --> alex

        String rawPassword = "adminblablabla";
        String encodedPassword = bcrypt.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}
