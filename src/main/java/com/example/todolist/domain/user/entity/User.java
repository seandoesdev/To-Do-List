package com.example.todolist.domain.user.entity;


import com.example.todolist.domain.base.entity.BaseEntity;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String role; // ROLE_USER, ROLE_ADMIN

    @CreationTimestamp
    private Timestamp loginDate;


    @Builder
    public User(String username, String password, String email, String role, Timestamp loginDate) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.loginDate = loginDate;
    }
}
