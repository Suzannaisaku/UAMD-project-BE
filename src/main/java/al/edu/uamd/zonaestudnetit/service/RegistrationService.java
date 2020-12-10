package com.ap.registration.service;

import com.ap.registration.model.User;
import com.ap.registration.repository.RegistrationReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService  {
    @Autowired
    private RegistrationReposetory repo;


    public User saveUser (User user){
       return repo.save(user);


    }
    public User fetchUserByEmailId(String email){
        return repo.findByEmailId(email);
    }
    public User fetchUserByEmailIdAndPassword(String email,String password){
        return repo.findByEmailIdAndPassword(email, password);
    }
}
