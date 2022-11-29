package com.userservice.service;

import com.userservice.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Component
public interface UserService {
   User createUser(User user);
   List<User> getAllUser();
   User updateUser(User user);

}
