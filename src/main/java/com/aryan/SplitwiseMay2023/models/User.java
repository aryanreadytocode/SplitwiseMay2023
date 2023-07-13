package com.aryan.SplitwiseMay2023.models;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "users")
public class User extends BaseModel{
    private String username;
    private String hsashedPassword;
    private String phoneNUmber;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", hsashedPassword='" + hsashedPassword + '\'' +
                ", phoneNUmber='" + phoneNUmber + '\'' +
                '}';
    }
}
