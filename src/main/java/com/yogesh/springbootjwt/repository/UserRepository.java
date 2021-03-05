package com.yogesh.springbootjwt.repository;

import com.yogesh.springbootjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findByUserName(String username);
}
