package com.example.facebook_api.Repository;

import com.example.facebook_api.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    User save(User user);
    ArrayList<User> findAll();
    User findAllByuserID(String userID);

}


