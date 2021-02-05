package userRegistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import userRegistration.services.UserService;

@Controller
public class HomePageController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"/", "/index", "/home" })
    // because we dont need to send any proucts or data from database to index we dont need Model model
    public String showHomePage(){
        return "index";
    }
}
