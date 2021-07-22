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
    public User signin(String userEmail, String userPassword) {
        User dbUser = userRepository.findByUserEmailAndUserPassword(userEmail, userPassword);

        if(dbUser != null) { // DB에 유저가 있다면
            return dbUser;
        }
        return null;
    }


    @Override
    public String signup(User user) {
        userRepository.save(user);
        return "signup";
    }

}