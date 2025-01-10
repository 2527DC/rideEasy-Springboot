package com.rideeasy.rideeasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rideeasy.rideeasy.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query method to find user by id
    User findById(long id);
}
