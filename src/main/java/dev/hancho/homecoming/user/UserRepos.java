package dev.hancho.homecoming.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);
    
}
