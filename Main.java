package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("For frame 1");
        Frames frame1 = new Frames();
        int frame1ko = frame1.gettotalscore();

        System.out.println("For frame 2");
        Frames frame2 = new Frames();
        int frame2ko = frame2.gettotalscore();

        System.out.println("For frame 3");
        Frames frame3 = new Frames();
        int frame3ko = frame3.gettotalscore();

        System.out.println("For frame 4");
        Frames frame4 = new Frames();
        int frame4ko = frame4.gettotalscore();

        System.out.println("For frame 5");
        Frames frame5 = new Frames();
        int frame5ko = frame5.gettotalscore();

        System.out.println("For frame 6");
        Frames frame6 = new Frames();
        int frame6ko = frame6.gettotalscore();

        System.out.println("For frame 7");
        Frames frame7 = new Frames();
        int frame7ko = frame7.gettotalscore();

        System.out.println("For frame 8");
        Frames frame8 = new Frames();
        int frame8ko = frame8.gettotalscore();

        System.out.println("For frame 9");
        Frames frame9 = new Frames();
        int frame9ko = frame9.gettotalscore();

        System.out.println("For frame ");
        Frames frame10 = new Frames();
        int frame10ko = frame10.gettotalscore();

        int lastkoscore = frame1ko + frame2ko + frame3ko + frame4ko + frame5ko + frame6ko + frame7ko + frame8ko + frame9ko + frame10ko;
        System.out.println("Great Your total score was " + lastkoscore+ "Hurray!!!!");
    }
}
