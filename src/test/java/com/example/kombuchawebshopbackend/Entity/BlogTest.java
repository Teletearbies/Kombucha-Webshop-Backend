package com.example.kombuchawebshopbackend.Entity;

import org.junit.jupiter.api.Test;

class BlogTest {


    @Test
    void createBlog() {
        Blog blog = new Blog();
        System.out.println(blog.getDate());
    }
}