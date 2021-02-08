package com.jpr.hardwares.jprservice.services;

import com.jpr.hardwares.jprservice.model.Users;

import java.util.List;

public interface UserService {
    public List<Users> getUsers();
    public Users saveUserDetails(Users users);
    public Users updateUsers(Users users);
    public String deleteUsers(Users users);

}
