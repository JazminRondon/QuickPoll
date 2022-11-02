package com.QuickPoll.favoriteseason.controllers;

import com.QuickPoll.favoriteseason.Poll;
import com.QuickPoll.favoriteseason.exception.ResourceNotFoundException;
import com.QuickPoll.favoriteseason.repository.PollRepository;
import com.QuickPoll.favoriteseason.servies.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RestController
public class PollController {

    @Autowired
    private PollService pollService;

//    protected void verifyPoll(Long pollId) throws ResourceNotFoundException {
//   //    Poll poll = pollRepository.findById(pollId).orElse(null);
//        Optional<Poll> poll = pollRepository.findById(pollId);
//        //wrap with an optional
//        if(poll == null|| poll.isEmpty()) {
//            throw new ResourceNotFoundException("Poll with id " + pollId + " not found");
//        }
//    }
    @GetMapping("/polls")
    public ResponseEntity<Iterable<Poll>> getAllPolls(){
        return pollService.getAllPolls();
    }

    @PostMapping("/polls")
    public void  createPoll(@Valid @RequestBody Poll poll) {
         pollService.createPoll(poll);
    }


    @GetMapping("/polls/{pollId}")
    public ResponseEntity<?> getPoll(@PathVariable Long pollId) {

        return pollService.getPoll(pollId);
    }
    @PutMapping("/polls/{pollId}")
    public ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable Long pollId) {

        return pollService.updatePoll(poll,pollId);
    }
    @DeleteMapping ("/polls/{pollId}")
    public void  deletePoll(@PathVariable Long pollId) {

        pollService.deletePoll(pollId);
    }

}//End of class
