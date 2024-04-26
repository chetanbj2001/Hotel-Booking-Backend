package com.dailycodework.demo.service;

import com.dailycodework.demo.model.User;

import javax.management.relation.RoleNotFoundException;
import java.util.List;

public interface IUserService {

    User registerUser(User user) ;

    List<User> getUsers();
    void deleteUser(String email);

    User getUser(String email);

}
