package com.dreams_2.project.service;


import com.dreams_2.project.model.Point;

public interface PointService {

    Point getById(int id); // must be DTO

    //  UserDTO findById(Integer id); - повинна бути реалізація
    Point add(Point point);


}
