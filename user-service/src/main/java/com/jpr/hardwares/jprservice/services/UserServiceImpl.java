package com.jpr.hardwares.jprservice.services;

import com.jpr.hardwares.jprservice.model.Users;
import com.jpr.hardwares.jprservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public List<Users> getUsers() {
        List<Users> userList=userRepository.findAll();
        return userList;
    }

    @Override
    public Users saveUserDetails(Users users) {
        Users userList=userRepository.save(users);
        return userList;
    }

    @Override
    public Users updateUsers(Users user) {
        Users userRes=userRepository.save(user);
        return userRes;
    }

    @Override
    public String deleteUsers(Users users) {
         userRepository.delete(users);
         return "success";
    }
}
