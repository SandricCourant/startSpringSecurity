package com.example.demo.services;

import com.example.demo.repositories.UserRepository;
import com.example.demo.services.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAll(){
        return userRepository.findAll();
    }
    public User get(int id){
        return userRepository.findById(id).orElse(null);
    }
    public User create(User user){

        try {
            return user.isCguSigned() ? userRepository.save(user) : null;
        }catch(Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }
    public boolean validateEmail(int id){

        try{
            User user = userRepository.findById(id).orElse(null);
            user.setEmailValidated(true);
            userRepository.save(user);
            return true;
        }catch (Exception e){
            System.err.println(e.getMessage());
            return false;
        }

    }

    public boolean delete(int id) {
        try{
            User user = userRepository.findById(id).orElse(null);
            userRepository.delete(user);
            return true;
        }catch (Exception e){
            System.err.println(e.getMessage());
            return false;
        }
    }

    public boolean validatePhone(int id, int code) {
        return true;
    }
}
