package com.example.facebook_api.Repository;

import com.example.facebook_api.Entity.Comment;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {

    Comment save(Comment comment);

    @AllowFiltering
    ArrayList<Comment> findAllByPostID(UUID postID);
}
