package com.aryan.SplitwiseMay2023.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRegisterRequestDTO {
    private String name;
    private String phone;
    private String password;
}
