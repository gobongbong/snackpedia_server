package com.team.snackpedia.user.controller;
import javax.servlet.http.HttpSession;

import com.team.snackpedia.model.User;
import com.team.snackpedia.repository.UserRepository;
import com.team.snackpedia.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @CrossOrigin("*")
    @PostMapping("/signup")
    public String signupPost(@ModelAttribute User user) {
        System.out.println(user);
                userService.signup(user);
        return "redirect:/signin";
    }

    @CrossOrigin("*")
    @PostMapping("/signin")
    public String signin(@RequestParam(value = "userEmail", defaultValue = "0") String userEmail,
                       @RequestParam(value = "userPassword", defaultValue = "0") String userPassword,  HttpSession session) {
       userService.signin(userEmail,userPassword,session); //pricipal 접근주체...라는데..뭔지..모르겠고요..
//        if(principal != null){
//            session.setAttribute("principal",principal);
//        }
        return "로그인 성공!";
        //return new ResposeDto<Integer>(HttpStatus.OK.value(),1); ㅎㅎ?머람
    }

    @GetMapping("/signout")
    public String signout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
