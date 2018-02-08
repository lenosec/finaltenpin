package com.company;

import java.util.Scanner;

public class Frames {
    int rollscored1 = getscore();
    int rollscored2 = getscore();
    int totalscored = rollscored1 + rollscored2;

    public Frames() {

        if (rollscored1 == 10 || rollscored2 == 10) {
            int rollscored3 = getscore();
            Score score = new Score(rollscored1, rollscored2);
            score.Scoreforall(rollscored3, rollscored1, rollscored2);
        } else {
            Score totalscore = new Score(rollscored1, rollscored2);
        }
    }

    public int gettotalscore() {
        return totalscored;
    }


    public static int getscore() {
        Scanner getroll1score = new Scanner(System.in);
        System.out.println("Please enter you roll score");
        int rollscore = getroll1score.nextInt();
        if (rollscore > 10) System.out.println("Sorry value cannot be greater than 10");
        return rollscore;
    }
}
