package al.edu.uamd.zonaestudnetit.repository;

import al.edu.uamd.zonaestudnetit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//komunikimi me databazen
public interface RegistrationReposetory extends JpaRepository<User,Integer> {

public User findByUserEmail(String userEmail);
public User findByUserEmailAndUserPassword(String userEmail,String userPassword);
}
