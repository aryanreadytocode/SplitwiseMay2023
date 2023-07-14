package com.aryan.SplitwiseMay2023.services;

public interface PasswordEncoder {

    String getEncodedPassword(String realPassword);

    boolean matches(String realPassword, String hashedPassword);

}
