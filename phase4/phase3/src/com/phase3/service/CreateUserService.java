package com.phase3.service;

import java.util.List;

import com.phase3.models.User;

public interface CreateUserService {
	User findById(int id);
    
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUser(int id);
 
    List<User> findAllUsers(); 
     
    User findUser(int id);
   
}
