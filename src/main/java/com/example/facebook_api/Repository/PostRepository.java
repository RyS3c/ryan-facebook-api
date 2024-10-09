package com.example.facebook_api.Repository;

import com.example.facebook_api.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {

    ArrayList<Post> findAll();
    Post save(Post post);

    void deleteById(UUID postID);
}
