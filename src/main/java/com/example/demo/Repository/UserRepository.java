package com.example.demo.Repository;

import com.example.demo.Entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findByUser_code(String user_code);
    List<UserEntity> findAllByUser_code(String user_code);
    User getReferenceByUser_code(String user_code);
}
