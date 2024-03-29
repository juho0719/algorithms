package com.juho.leetCode.challenge.y2021.month01.day13;

import java.util.Arrays;

public class BoatsToSavePeople {
    
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int boat = 0;
        int min = 0;
        int max = people.length-1;

        while(min <= max) {
            if(min == max) {
                boat++;
                break;
            }
            if(people[min] + people[max] <= limit) {
                boat++;
                min++;
                max--;
            } else {
                boat++;
                max--;
            }
        }
        return boat;
    }
}