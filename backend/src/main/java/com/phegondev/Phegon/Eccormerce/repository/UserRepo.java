package com.phegondev.Phegon.Eccormerce.repository;

import com.phegondev.Phegon.Eccormerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
