package userRegistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import userRegistration.services.UserService;

@Controller
public class RegistrationProcessController {

    @Autowired
    UserService userService;

    @RequestMapping(value= "/register")
    public String showRegistrationPro (Model model){
        return "register-user";
    }
}
