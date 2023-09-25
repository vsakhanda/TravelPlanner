package com.dreams_2.project.service;


import com.dreams_2.project.model.Route;

public interface RouteService {

    Route getById(int id); // must be DTO

    //  UserDTO findById(Integer id); - повинна бути реалізація
    Route add(Route route);


}
