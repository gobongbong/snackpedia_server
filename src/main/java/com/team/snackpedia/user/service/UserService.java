package com.team.snackpedia.user.service;

import com.team.snackpedia.model.User;

import javax.servlet.http.HttpSession;

public interface UserService {
//    public void signin(String userEmail, String userPassword, HttpSession session);
        public String signin(String userEmail, String userPassword, HttpSession session);

    public String signup(User user);

}
