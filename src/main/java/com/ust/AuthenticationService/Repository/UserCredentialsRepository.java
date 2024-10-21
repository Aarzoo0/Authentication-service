package com.ust.AuthenticationService.Repository;


import com.ust.AuthenticationService.Entity.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCredentialsRepository extends JpaRepository<UserCredentials,Integer> {
    public Optional<UserCredentials> findByName(String name);
}


