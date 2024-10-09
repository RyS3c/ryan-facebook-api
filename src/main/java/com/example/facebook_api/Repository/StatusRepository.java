package com.example.facebook_api.Repository;

import com.example.facebook_api.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface StatusRepository extends JpaRepository<Status, UUID> {

    Status save(Status status);
    ArrayList<Status> findAll();

}
