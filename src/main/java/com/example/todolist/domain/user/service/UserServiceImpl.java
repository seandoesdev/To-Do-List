package com.example.todolist.domain.user.service;

import com.example.todolist.domain.user.entity.User;
import com.example.todolist.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    // 회원가입
    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
}
