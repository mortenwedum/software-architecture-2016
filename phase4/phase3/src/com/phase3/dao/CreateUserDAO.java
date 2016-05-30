package com.phase3.dao;

import java.util.List;

import com.phase3.models.User;

public interface CreateUserDAO {
	
	User findById(int id);
	 
    void saveUser(User user);
     
    void deleteUser(int id);
     
    List<User> findAllUsers();
 
    User findUser(int id);
}
