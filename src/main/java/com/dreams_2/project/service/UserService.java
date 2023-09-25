package com.dreams_2.project.service;

import com.dreams_2.project.model.User;

public interface UserService {

    User getById(int id); // must be DTO

    //  UserDTO findById(Integer id); - повинна бути реалізація
    User add(User user);


}
