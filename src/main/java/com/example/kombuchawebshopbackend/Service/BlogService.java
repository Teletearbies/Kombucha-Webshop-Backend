package com.example.kombuchawebshopbackend.Service;

import com.example.kombuchawebshopbackend.Entity.Blog;
import com.example.kombuchawebshopbackend.Repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    @Autowired
    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    public Blog getBlogById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }

    public Blog updateBlog(Long id, Blog blog) {
        if (blogRepository.findById(id).isEmpty()) {
            return null;
        }
        return blogRepository.save(blog);
    }
}