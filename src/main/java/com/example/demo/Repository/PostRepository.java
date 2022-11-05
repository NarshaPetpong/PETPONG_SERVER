package com.example.demo.Repository;

import com.example.demo.Entity.Post_boardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post_boardEntity, Long> {

}