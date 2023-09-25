package com.dreams_2.project.controller;


import com.dreams_2.project.model.Route;
import com.dreams_2.project.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/api/v1/routes")
public class RouteController {

    private final RouteService rservice;

    @Autowired
    public RouteController(RouteService rservice) {
        this.rservice = rservice;
    }

    @GetMapping("/admin")
    public String getAdminInfo() {
        return "Hello admin";
    }

    @GetMapping("/info")
    public String getUser() {
        return "Hello user";
    }

    @GetMapping("/public")
    public String publicinfo() {
        return "Public info - hello java world!";
    }

    @GetMapping("/parameter/{userId}")
    public ResponseEntity<Route> getParameter(@PathVariable("userId") int routeId) { //@PathVariable - вичитування назви з URL
        return ResponseEntity.ok(rservice.getById(routeId));
    }

    @GetMapping("/requestparameter")
    public ResponseEntity<Route> getByRequestParam(@RequestParam("routeId") int routeId) { //@PathVariable - вичитування назви з URL
        return ResponseEntity.ok(rservice.getById(routeId));
    }

    @PostMapping("/requestBody")
    public ResponseEntity<Route> postUser(@RequestBody Route route) { //@PathVariable - вичитування назви з URL
        return ResponseEntity.ok(rservice.add(route));

    }
}


