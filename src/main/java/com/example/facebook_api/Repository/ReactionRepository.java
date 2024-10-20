package com.example.facebook_api.Repository;

import com.example.facebook_api.Entity.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface ReactionRepository extends JpaRepository<Reaction, UUID> {

    Reaction save(Reaction reaction);
    ArrayList<Reaction> findAll();
//    Reaction findAllByReactID(UUID reactID);
}