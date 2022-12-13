package com.example.kombuchawebshopbackend.Controller;

import com.example.kombuchawebshopbackend.Dtos.LoginDTO;
import com.example.kombuchawebshopbackend.Dtos.LoginOutcomeDTO;
import com.example.kombuchawebshopbackend.Service.UserDetailsService;
import com.google.gson.Gson;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class LoginController {

   private final Gson gson = new Gson();
    private final UserDetailsService userDetailsService;

    public LoginController(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @PostMapping("/loginuser")
   // @PreAuthorize("hasRole('ADMIN')")
    public String loginPost(@RequestBody LoginDTO loginDetails) {
        // check the database or service if this username/password is valid
        try {
            UserDetails userDetails =  userDetailsService.loadUserByUsername(loginDetails.getUsername());
            if (userDetails.getPassword().contentEquals(loginDetails.getPassword())) {
                System.out.println("login sucessful");
                return gson.toJson(new LoginOutcomeDTO(userDetails.getUsername(), 200));
            } else {
                System.out.println("wrong password");
                return gson.toJson(new LoginOutcomeDTO(userDetails.getUsername(), 400));
            }
        } catch (UsernameNotFoundException usernameNotFoundException){
            System.out.println("wrong username");
            return gson.toJson(new LoginOutcomeDTO("", 402));
        }
    }

    @GetMapping("/usertest")
    @PreAuthorize("hasRole('USER')")
    public String userTest() {
        var c = SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        return "User Test";
    }


    @GetMapping("/admintest")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminTest() {
        var c = SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        return "Admin Test";
    }
}
