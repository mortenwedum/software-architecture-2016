package com.phase3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.phase3.dao.CreateUserDAO;
import com.phase3.models.User;

@Service("createUserService")
@Transactional
public class CreateUserServiceImpl implements CreateUserService {

    @Autowired
    private CreateUserDAO dao;
     
    public User findById(int id) {
        return dao.findById(id);
    }
 
    public void saveUser(User user) {
        dao.saveUser(user);
    }
 
    public void updateUser(User user) {
        User entity = dao.findById(user.getId());
        if(entity!=null){
            entity.setName(user.getName());
            entity.setJoiningDate(user.getJoiningDate());
            entity.setAddress(user.getAddress());
            entity.setPhoneNumber(user.getPhoneNumber());
        }
    }
 
    public void deleteUser(int id) {
        dao.deleteUser(id);
    }
     
    public List<User> findAllUsers() {
        return dao.findAllUsers();
    }
 
    public User findUser(int id) {
        return dao.findUser(id);
    }
}
