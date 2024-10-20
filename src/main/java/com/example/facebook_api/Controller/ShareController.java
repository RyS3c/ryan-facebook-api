package com.example.facebook_api.Controller;

import com.example.facebook_api.Entity.Share;
import com.example.facebook_api.Service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/Shares")
public class ShareController  {

    @Autowired
    ShareService shareService;

    @GetMapping("/AllShares")
    public ArrayList<Share> retrieveAllUsersWhoShare() {
        ArrayList<Share> result = shareService.retrieveAllUsersWhoShare();
        return result;
    }

    @GetMapping("/Share/{userID}")
    public Share retrieveAllUsersWhoShareByID(@PathVariable("userID")UUID userID) {
        return shareService.retrieveallUsersWhoShareByID(userID);
    }
}
