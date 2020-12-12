package al.edu.uamd.zonaestudnetit.service;

import al.edu.uamd.zonaestudnetit.model.User;
import al.edu.uamd.zonaestudnetit.repository.RegistrationReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component //auto u
public class RegistrationService  {
    @Autowired
    private RegistrationReposetory repo;


    public User saveUser (User user){
       return repo.save(user);


    }
    public User fetchUserByEmailId(String email){
        return repo.findByUserEmail(email);
    }
    public User fetchUserByEmailIdAndPassword(String email,String password){
        return repo.findByUserEmailAndUserPassword(email, password);
    }
}
