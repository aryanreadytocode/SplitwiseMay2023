package com.aryan.SplitwiseMay2023.repos;

import com.aryan.SplitwiseMay2023.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
}
