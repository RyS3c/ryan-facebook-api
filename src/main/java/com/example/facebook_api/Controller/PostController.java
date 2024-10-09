package com.example.facebook_api.Controller;

import com.example.facebook_api.Entity.Post;
import com.example.facebook_api.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/postService")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/save")
    public ArrayList<Post> savePost(@RequestBody Post post) {
        return postService.submitPostToDB(post);
    }

    @GetMapping("/getPost")
    public ArrayList<Post> retrieveAllPost() {
        ArrayList<Post> result = postService.retrieveDataFromDB();
        result.sort((e1, e2) -> e2.getDateTime().compareTo(e1.getDateTime()));
        return result;
    }

    @DeleteMapping("/delete/{postId}")
    public ArrayList<Post> deleteAllPost(@PathVariable("postId")UUID postID) {
        return postService.deletePostFromDB(postID);
    }
}
