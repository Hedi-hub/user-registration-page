package userRegistration.initialData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import userRegistration.models.User;
import userRegistration.services.UserService;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {

    @Autowired
    UserService userService;

    @PostConstruct
    public void initializedInfo(){

        User user1 = new User("Ansgar", "12345", "12345");

        userService.saveUserNamePass(user1);
    }
}
