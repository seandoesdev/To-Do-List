package com.example.todolist.web.login;

import com.example.todolist.domain.user.entity.User;
import com.example.todolist.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class
LoginController {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserService userServiceImpl;

    @GetMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }

    @PostMapping("/login")
    public String login(){
        System.out.println("Login");
        return "redirect:/";
    }

    @PostMapping("/join")
    public String join(User user){
        System.out.println(user);

        user.setRole("ROLE_USER");

        // password 암호화
        String rawPassword = user.getPassword();
        String encPassword = bCryptPasswordEncoder.encode(rawPassword);
        user.setPassword(encPassword);

        userServiceImpl.create(user);
        return "redirect:/loginForm";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/info")
    public @ResponseBody String info(){
        return "info";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/manager")
    public String manager(){
        return "manager";
    }
}
