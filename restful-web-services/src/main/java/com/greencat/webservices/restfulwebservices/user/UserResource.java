package com.greencat.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService serviceDao;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return serviceDao.findAll();
    }

}
