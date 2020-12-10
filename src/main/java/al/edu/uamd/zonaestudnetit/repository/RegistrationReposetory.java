package com.ap.registration.repository;

import com.ap.registration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//komunikimi me databazen
public interface RegistrationReposetory extends JpaRepository<User,Integer> {

public User findByEmailId(String emailId);
public User findByEmailIdAndPassword(String emailId,String password);
}
