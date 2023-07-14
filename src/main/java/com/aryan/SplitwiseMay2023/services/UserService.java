package com.aryan.SplitwiseMay2023.services;

import com.aryan.SplitwiseMay2023.dtos.UserRegisterRequestDTO;
import com.aryan.SplitwiseMay2023.models.User;
import com.aryan.SplitwiseMay2023.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(UserRegisterRequestDTO userRegisterRequestDTO) {
        User user = new User();
        user.setUsername(userRegisterRequestDTO.getName());
        user.setPhoneNUmber(userRegisterRequestDTO.getPhone());
        return user;
    }
}
