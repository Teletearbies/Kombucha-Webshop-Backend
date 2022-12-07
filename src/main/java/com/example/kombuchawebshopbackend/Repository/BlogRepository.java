package com.example.kombuchawebshopbackend.Repository;

import com.example.kombuchawebshopbackend.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}