package com.example.todolist.domain.user.repository;

import com.example.todolist.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
