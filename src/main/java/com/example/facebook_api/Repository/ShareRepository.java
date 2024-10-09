package com.example.facebook_api.Repository;

import com.example.facebook_api.Entity.Share;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface ShareRepository extends JpaRepository<Share, UUID> {

    Share findAllByUserID(UUID userID);
    ArrayList<Share> findAll();

}
