package model;

public class PollChoice {

    int votes;
    String choice;
    String url;

    public PollChoice(int votes, String choice, String url) {
        this.votes = votes;
        this.choice = choice;
        this.url = url;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
