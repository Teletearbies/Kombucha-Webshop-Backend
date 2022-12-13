package com.example.kombuchawebshopbackend.Controller;


import com.example.kombuchawebshopbackend.Entity.Blog;
import com.example.kombuchawebshopbackend.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/blogs")
    public List<Blog> getAllBlog() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/blogs/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable("id") Long id) {
        Blog blog = blogService.getBlogById(id);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @PostMapping("/blogs")
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog) {
        Blog newBlog = blogService.createBlog(blog);
        return new ResponseEntity<>(newBlog, HttpStatus.CREATED);
    }

    @PutMapping("/blogs/{id}")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog, @PathVariable("id") Long id) {
        return new ResponseEntity<>(blogService.updateBlog(id, blog), HttpStatus.OK);
    }

    @DeleteMapping("/blogs/{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable("id") Long id) {
        blogService.deleteBlog(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
