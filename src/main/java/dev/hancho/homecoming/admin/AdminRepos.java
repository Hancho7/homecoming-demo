package dev.hancho.homecoming.admin;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepos extends JpaRepository<Admin, String> {

    Optional<Admin> findByEmail(String email);
    
}
