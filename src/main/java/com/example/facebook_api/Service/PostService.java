package com.example.facebook_api.Service;

import com.example.facebook_api.Entity.Post;
import com.example.facebook_api.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class PostService {

    @Autowired
    PostRepository postRepo;

    public ArrayList<Post> submitPostToDB(Post postData) {

        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        postData.setPostID(UUID.randomUUID());
        postData.setLikes(0);
        postData.setDateTime(dateTime);

        postRepo.save(postData);
        return retrieveDataFromDB();
    }

    public ArrayList<Post> retrieveDataFromDB() {
        return postRepo.findAll();
    }

    public ArrayList<Post> deletePostFromDB(UUID postID) {
        postRepo.deleteById(postID);

        return retrieveDataFromDB();
    }
}
