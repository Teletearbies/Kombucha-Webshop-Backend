package com.example.kombuchawebshopbackend.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date date = new Date();

    @Column(length = 50)
    private String title;

    @Column(length = 500)
    private String description;

    public Blog(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
