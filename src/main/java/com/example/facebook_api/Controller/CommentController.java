package com.example.facebook_api.Controller;

import com.example.facebook_api.Entity.Comment;
import com.example.facebook_api.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/commentService")
public class CommentController {

    @Autowired
    CommentService commentService;


    @PostMapping("/save")
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @GetMapping("/getAllComment")
    public ArrayList<Comment> getAllComment(@PathVariable("postID") UUID postID) {
        return commentService.getAllComment(postID);
    }
}
