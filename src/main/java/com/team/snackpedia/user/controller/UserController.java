package com.team.snackpedia.user.controller;
import javax.servlet.http.HttpSession;

import com.team.snackpedia.model.User;
import com.team.snackpedia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/signup")
    public void signupPost(@ModelAttribute User user) {
        System.out.println(1111);
        userRepository.save(user);
        //return "redirect:/";
    }

    @PostMapping("/signin")
    public void signinPost(@ModelAttribute User user, HttpSession session) {
//         Optional<User> opt = userRepository.findByEmailAndPwd(user.getUserEmail(), user.getUserPassword());
//        if(opt.isPresent()) {
//            session.setAttribute("user", opt.get());
//        }
//        return "redirect:/";
        System.out.println("나와라라아ㅏ아");
    }
//    @GetMapping("/signout")
//    public String signout(HttpSession session) {
//        session.invalidate();
//        return "redirect:/";
 //   }
}