package com.juho.leetCode.challenge.y2021.month09.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumNumberOfBalloonsTest {

    MaximumNumberOfBalloons mnb = new MaximumNumberOfBalloons();

    @Test
    public void maximumNumberOfBalloons01Test() {
        String text01 = "nlaebolko";
        assertEquals(1, mnb.maxNumberOfBalloons(text01));

        String text02 = "loonbalxballpoon";
        assertEquals(2, mnb.maxNumberOfBalloons(text02));

        String text03 = "leetcode";
        assertEquals(0, mnb.maxNumberOfBalloons(text03));
    }
}