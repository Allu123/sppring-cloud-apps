package com.jpr.hardwares.jprservice.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.jpr.hardwares.jprservice.model.Users;
import com.jpr.hardwares.jprservice.services.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/jpr/user")
public class UserController {



    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    public UserServiceImpl userService;


    @RequestMapping( value = "/allUsers", method = RequestMethod.GET)
    public List<Users> getUsers() {

        List<Users> userList=userService.getUsers();
        return userList;
    }


    @RequestMapping(value = "/saveUser", method = RequestMethod.POST )
    public Users saveUserDetails(@RequestBody Users users) {
        LOG.info(users.toString());
        Users userList=userService.saveUserDetails(users);
        return userList;
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    public Users updateUsers(@RequestBody Users users) {
        Users userList=userService.updateUsers(users);
        return userList;
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public String deleteUsers(@RequestBody Users users) {
         userService.deleteUsers(users);
        return "Success";
    }
}
