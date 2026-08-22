package com.embarkx.ChallengeApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChallengeController {
    private List<Challenges> challenges = new ArrayList<>();

    public ChallengeController() {
        Challenges challenge1 = new Challenges(1, "January", "build something");
        challenges.add(challenge1);
    }

    @GetMapping("/challenges")
    public List<Challenges> getAllChallenges() {
        return challenges;
    }

    @PostMapping("/challenges")
    public String addChallenge(@RequestBody Challenges challenge){
        challenges.add(challenge);
                return "Challenge accepted successfully";
    }

}
