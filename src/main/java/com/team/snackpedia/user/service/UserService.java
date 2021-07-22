package com.team.snackpedia.user.service;

import com.team.snackpedia.model.User;

import javax.servlet.http.HttpSession;

public interface UserService {
    public User signin(String userEmail, String userPassword);
    public String signup(User user);

}
