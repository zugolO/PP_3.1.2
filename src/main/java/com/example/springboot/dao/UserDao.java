package com.example.springboot.dao;


import com.example.springboot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    void editUser(User user, Long id);

    void deleteUser(Long id);

    User getById(Long id);
}
