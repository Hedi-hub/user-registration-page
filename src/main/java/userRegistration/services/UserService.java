package userRegistration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import userRegistration.models.User;
import userRegistration.repositories.UserRepository;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUserNamePass(User user){
        userRepository.save(user);
    }

    public void removeUserNamePass(User user){
        userRepository.delete(user);
    }

    public void updatePass(int id, String password){
       User user= userRepository.findById(id);
       String newPass = password;
       userRepository.save(user);
    }

    public List<User> getAllUser(){
        return (List<User>) userRepository.findAll();
    }

    public User getUserById(Integer id){
        return userRepository.findById(id).get();
    }


}
