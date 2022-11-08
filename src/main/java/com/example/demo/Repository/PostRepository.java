package com.example.demo.Repository;

import com.example.demo.Entity.boardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<boardEntity, Long> {

}