package com.github.toastedflaco.redditclon.repository;

import com.github.toastedflaco.redditclon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
