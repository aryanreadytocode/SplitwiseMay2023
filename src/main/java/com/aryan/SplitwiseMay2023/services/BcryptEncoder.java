package com.aryan.SplitwiseMay2023.services;

import org.springframework.beans.factory.annotation.Autowired;

public class BcryptEncoder implements PasswordEncoder{

    @Autowired
    private BcryptEncoder bcryptEncoder;

    @Override
    public String getEncodedPassword(String realPassword) {
        return bcryptEncoder.getEncodedPassword(realPassword);
    }

    @Override
    public boolean matches(String realPassword, String hashedPassword) {
        return bcryptEncoder.matches(realPassword, hashedPassword);
    }
}
