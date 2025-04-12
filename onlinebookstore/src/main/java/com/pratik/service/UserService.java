package com.pratik.service;

import javax.servlet.http.HttpSession;

import com.pratik.model.StoreException;
import com.pratik.model.User;
import com.pratik.model.UserRole;

public interface UserService {

    public User login(UserRole role, String email, String password, HttpSession session) throws StoreException;

    public String register(UserRole role, User user) throws StoreException;

    public boolean isLoggedIn(UserRole role, HttpSession session);

    public boolean logout(HttpSession session);

}
