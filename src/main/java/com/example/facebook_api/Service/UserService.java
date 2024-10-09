package com.example.facebook_api.Service;

import com.example.facebook_api.Entity.User;
import com.example.facebook_api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public User submitMetaDataOfUser(User user) {

        Date date = new Date();
        long time = date.getTime();

        Timestamp dateTime = new Timestamp(time);

        user.setActive(true);
        user.setJoiningData(dateTime);

        return userRepo.save(user);
    }

    public ArrayList<User> retrieveALlUserDetails() {
        return userRepo.findAll();
    }

    public User getUserData(String userID) {
        return userRepo.findAllByuserID(userID);
    }
}
