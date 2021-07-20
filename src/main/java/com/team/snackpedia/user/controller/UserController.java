package com.team.snackpedia.user.controller;
import javax.servlet.http.HttpSession;

import com.team.snackpedia.model.User;
import com.team.snackpedia.repository.UserRepository;
import com.team.snackpedia.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @CrossOrigin("*")
    @PostMapping("/signup")
    public String signupPost(@ModelAttribute User user) {
        userService.signup(user);
        return "스낵피디아에 온 것을 환영합니다!";
//        userRepository.save(user);

//        return "redirect:/"
    }

//    @PostMapping("/signin")
//    public void signinPost(@ModelAttribute User user, HttpSession session) {
//         //Optional<User> opt = userRepository.findByEmailAndPwd(user.getUserEmail(), user.getUserPassword());
////        if(opt.isPresent()) {
////            session.setAttribute("user", opt.get());
////        }
////        return "redirect:/";
//        System.out.println("나와라라아ㅏ아");
//    }
    @CrossOrigin("*")
    @PostMapping("/signin")
    public String signin(@RequestParam(value = "userEmail", defaultValue = "0") String userEmail,
                       @RequestParam(value = "userPassword", defaultValue = "0") String userPassword,  HttpSession session) {
        return "로그인 성공!";
    }


    @GetMapping("/signout")
    public String signout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
