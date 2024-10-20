package com.example.facebook_api.Controller;

import com.example.facebook_api.Entity.Reaction;
import com.example.facebook_api.Service.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api/Reactions")
public class ReactionController {

    @Autowired
    ReactionService reactionService;

    @PostMapping("/save")
    public Reaction saveReactions(@RequestBody Reaction reaction) {
        return reactionService.allReaction(reaction);
    }

    @GetMapping("/allreactions")
    public ArrayList<Reaction> retrieveAllReactions() {
        return reactionService.retrieveAllReaction();
    }

//    @GetMapping("/getallreactions/{reactID}")
//    public Reaction getAllReactionByID(@PathVariable("reactID")UUID reactID) {
//        return reactionService.retrieveAllReactionByID(reactID);
//    }
}
