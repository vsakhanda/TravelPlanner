package com.dreams_2.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Trip {

    private int id;
    private String name;
//    private int author;
//    private String description;
//    private String datetime;
//    private boolean is_compleated;

}
