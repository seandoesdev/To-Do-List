package com.example.todolist.domain.user.service;

import com.example.todolist.domain.user.entity.User;
import com.example.todolist.domain.user.repository.UserRepository;

public interface UserService {

    public User create(User user);
}
