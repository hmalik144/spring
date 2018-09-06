package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Poll;
import model.PollChoice;
import service.PollService;


@RestController
@RequestMapping("/questions")
public class PollController {
	
	@Autowired
    PollService pollService;

    @RequestMapping("/")
    public ArrayList<Poll> getAll(){
        return pollService.getAllPolls();
    }
    
    @RequestMapping("testing")
    public String getDefault(){
        return "hello";
    }
    
    @RequestMapping("{id}")
    public Poll getCurrentPoll(@PathVariable("") int id) {
    	return pollService.getPoll(id);
    }
    
    @RequestMapping("{id:[\\d]+}/choices/{choice}")
    public PollChoice getCurrentPoll(@PathVariable("") int id, @PathVariable("") int choice) {
    	return pollService.getcurrentPollChoice(id,choice);
    }

	

}
