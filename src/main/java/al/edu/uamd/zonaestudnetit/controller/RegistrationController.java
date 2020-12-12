package al.edu.uamd.zonaestudnetit.controller;
import al.edu.uamd.zonaestudnetit.model.User;
import al.edu.uamd.zonaestudnetit.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService service;
    @PostMapping("/registeruser")
    public  User registerUser (@RequestBody User user) throws Exception {
        String tempEmailId = user.getUserEmail();
        if(tempEmailId!=null && !"".equals(tempEmailId)) {
            User userobj=service.fetchUserByEmailId(tempEmailId);
            if (userobj !=null){
                throw new Exception ("useri" + tempEmailId +"Ekziston");
            }
        }
        User userObj=null;
        userObj=service.saveUser(user);
        return userObj;

    }
    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User user)  {
        String tempEmailId= user.getUserEmail();
        String tempPass = user.getUserPassword();
        User userObj=null;
        if(tempEmailId!=null && tempPass!=null){
            userObj= service.fetchUserByEmailIdAndPassword(tempEmailId,tempPass);

        }

        if (userObj==null){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        return new ResponseEntity<>(userObj,HttpStatus.OK) ;
    }
}
