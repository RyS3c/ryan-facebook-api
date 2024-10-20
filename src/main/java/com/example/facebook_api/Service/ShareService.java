package com.example.facebook_api.Service;

import com.example.facebook_api.Entity.Share;
import com.example.facebook_api.Repository.ShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ShareService {

    @Autowired
    ShareRepository shareRepo;


    public ArrayList<Share> retrieveAllUsersWhoShare() {
        return shareRepo.findAll();
    }

    public Share retrieveallUsersWhoShareByID(UUID userID) {
        return shareRepo.findAllByUserID(userID);
    }
}
