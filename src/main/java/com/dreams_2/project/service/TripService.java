package com.dreams_2.project.service;

import com.dreams_2.project.model.Trip;

public interface TripService {

    Trip getById(int id); // must be DTO

    //  UserDTO findById(Integer id); - повинна бути реалізація
    Trip add(Trip trip);


}
