package com.example.facebook_api.Service;

import com.example.facebook_api.Entity.Reaction;
import com.example.facebook_api.Repository.ReactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ReactionService {

    @Autowired
    ReactionRepository reactRepo;

    public Reaction allReaction(Reaction reaction) {
        return reactRepo.save(reaction);
    }

    public ArrayList<Reaction> retrieveAllReaction() {
        ArrayList<Reaction> result = reactRepo.findAll();

        return result;
    }

//    public Reaction retrieveAllReactionByID(UUID reactID) {
//        return reactRepo.findAllByReactID(reactID);
//    }
}
