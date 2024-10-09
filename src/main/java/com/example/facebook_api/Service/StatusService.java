package com.example.facebook_api.Service;

import com.example.facebook_api.Entity.Status;
import com.example.facebook_api.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class StatusService {

    @Autowired
    StatusRepository statusRepo;

    public Status save(Status status) {

        Date date = new Date();
        long time = date.getTime();

        Timestamp dateTime = new Timestamp(time);

        status.setStatusID(UUID.randomUUID());
        status.setUploadTime(dateTime);

        return statusRepo.save(status);
    }

    public ArrayList<Status> getAllStatus () {
        ArrayList<Status> result = new ArrayList<Status>();
        result = statusRepo.findAll();

        result.sort((e1, e2) -> e2.getUploadTime().compareTo(e1.getUploadTime()));
        return result;
    }
}
