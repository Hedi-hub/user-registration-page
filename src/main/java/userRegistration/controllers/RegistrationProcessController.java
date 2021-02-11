package userRegistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import userRegistration.models.User;
import userRegistration.services.UserService;

@Controller
public class RegistrationProcessController {

    @Autowired
    UserService userService;

    @RequestMapping(value= "/register")
    public String showRegistrationPro (){
        return "register-user";
    }
    @RequestMapping(value="/register-now")
    public String showSuccessRegister (@RequestParam ("userName") String userName,
                                       @RequestParam ("userPass")String userPass,
                                       @RequestParam ("userPassConfirm") String userPassConfirm){

        User user = new User(userName, userPass, userPassConfirm);
        userService.saveUserNamePass(user);

        return "index";
    }
}
