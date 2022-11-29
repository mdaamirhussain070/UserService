package com.userservice.userserviceImpl;

import com.userservice.dao.UserRepo;
import com.userservice.entity.User;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public User createUser(User user) {
        return userRepo.save(user);

    }

    @Override
    public List<User> getAllUser() {
        List<User> userList=userRepo.findAll();
        return userList;
    }

    @Override
    public User updateUser(User user) {
        boolean userOld=userRepo.existsById(user.getId());
        User savedUser = null;
        if(userOld==true){
            Optional<User> preUser=userRepo.findById(user.getId());
            if((preUser.isPresent()))
                preUser.get().setUserName(user.getUserName());
            savedUser=userRepo.save(preUser.get());
        }
        return savedUser;
    }
}
