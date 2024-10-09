package com.example.facebook_api.Controller;

import com.example.facebook_api.Entity.Status;
import com.example.facebook_api.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api/statusService")
public class StatusController {

    @Autowired
    StatusService statusService;

    @PostMapping("/save")
    public Status saveStatus(@RequestBody Status status) {
        return statusService.save(status);
    }

    @GetMapping("/retrieveAllStatus")
    public ArrayList<Status> retrieveAllStatus() {
        return statusService.getAllStatus();
    }
}
