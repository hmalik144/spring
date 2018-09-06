package model;

import java.util.ArrayList;

public class Poll {

    String url;
    ArrayList<PollChoice> PollChoice;
    String question;
    String publishStamp;

    public Poll(String url, ArrayList<PollChoice> pollChoice, String question, String publishStamp) {
        this.url = url;
        PollChoice = pollChoice;
        this.question = question;
        this.publishStamp = publishStamp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<PollChoice> getPollChoice() {
        return PollChoice;
    }

    public void setPollChoice(ArrayList<PollChoice> pollChoice) {
        PollChoice = pollChoice;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getPublishStamp() {
        return publishStamp;
    }

    public void setPublishStamp(String publishStamp) {
        this.publishStamp = publishStamp;
    }
}