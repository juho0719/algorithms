package com.juho.leetCode.challenge.y2021.month10.day12;

public class GuessGame {
    int pick = 0;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    protected int guess(int num) {
        if(pick < num) {
            return -1;
        } else if(pick > num) {
            return 1;
        } else {
            return 0;
        }
    }
}
