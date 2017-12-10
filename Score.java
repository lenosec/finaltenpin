package com.company;

public class Score {
    int roll1score;
    int roll2score;
    int roll3score;

    public Score(int roll1score, int roll2score) {
        this.roll1score = roll1score;
        this.roll2score = roll2score;
        int totalscore = roll1score + roll2score;
        System.out.println("So your total score was " + totalscore);
    }
    public Score(int roll1sparescore,int roll2sparescore,int roll3sparescore){
        this.roll1score = roll1sparescore;
        this.roll2score = roll2sparescore;
        this.roll3score = roll3sparescore;
        int totalscore = roll1sparescore + roll2sparescore+roll3sparescore;
        System.out.println("So your total score was " + totalscore);
    }

}
