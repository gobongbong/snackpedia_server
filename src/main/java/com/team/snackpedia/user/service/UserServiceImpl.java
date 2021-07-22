package com.team.snackpedia.user.service;

import com.team.snackpedia.model.User;
import com.team.snackpedia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public String signin(String userEmail, String userPassword, HttpSession session) {
        System.out.println(userEmail + " : " + userPassword);
        System.out.println("DB 유저 >>>>>> " + userRepository.findByUserEmailAndUserPassword(userEmail, userPassword));
//        return userRepository.findByUserEmailAndUserPassword(userEmail);
        User dbUser = userRepository.findByUserEmailAndUserPassword(userEmail, userPassword);

        if(dbUser != null) { //
            System.out.println(dbUser);
//            session.setAttribute("키값", dbUser.getId());
            return dbUser.getUserEmail();
        }
        return "0";
    }


    @Override
    public String signup(User user) {
        userRepository.save(user);
        return "signup";
    }

}
