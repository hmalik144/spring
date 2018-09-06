package service;

import java.util.Date;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import model.Poll;
import model.PollChoice;

@Service
public class PollService {

    ArrayList<Poll> pollsArray = new ArrayList<Poll>();
    Date date = new Date();

    public PollService(){
        String url = "/questions/1";
        String question = "Which is your favourite State?";
        PollChoice pollChoice1= new PollChoice(86,"QLD","/questions/1/choices/1");
        PollChoice pollChoice2= new PollChoice(43,"NSW","/questions/1/choices/2");
        PollChoice pollChoice3= new PollChoice(79,"VIC","/questions/1/choices/3");
        PollChoice pollChoice4= new PollChoice(51,"WA","/questions/1/choices/4");
        PollChoice pollChoice5= new PollChoice(33,"TAS","/questions/1/choices/5");
        PollChoice pollChoice6= new PollChoice(12,"ACT","/questions/1/choices/6");
        PollChoice pollChoice7= new PollChoice(21,"SA","/questions/1/choices/7");
        PollChoice pollChoice8= new PollChoice(18,"NT","/questions/1/choices/8");

        ArrayList<PollChoice> pollChoiceArrayList = new ArrayList<PollChoice>();
        pollChoiceArrayList.add(pollChoice1);
        pollChoiceArrayList.add(pollChoice2);
        pollChoiceArrayList.add(pollChoice3);
        pollChoiceArrayList.add(pollChoice4);
        pollChoiceArrayList.add(pollChoice5);
        pollChoiceArrayList.add(pollChoice6);
        pollChoiceArrayList.add(pollChoice7);
        pollChoiceArrayList.add(pollChoice8);

        String publishStamp = String.valueOf(date);

        Poll poll = new Poll(url,pollChoiceArrayList, question, publishStamp);

        pollsArray.add(poll);
    }

    public Poll getPoll(int id){
        if (pollsArray == null) {
            return null;
        }else {
            return pollsArray.get((id - 1));
        }
    }

    public ArrayList<Poll> getAllPolls(){
        return pollsArray;
    }

    public PollChoice getcurrentPollChoice(int question, int pollChoice){
        Poll currentPoll = pollsArray.get((question - 1));
        ArrayList<PollChoice> currentPollChoices = currentPoll.getPollChoice();
        PollChoice currentPollChoice = currentPollChoices.get((pollChoice - 1));

        return currentPollChoice;
    }
    
    
}
