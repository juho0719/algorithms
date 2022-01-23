package com.juho.leetCode.challenge.y2022.month01.day23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 * 
 * Example 1:
 * Input: low = 100, high = 300
 * Output: [123,234]
 * 
 * Example 2:
 * Input: low = 1000, high = 13000
 * Output: [1234,2345,3456,4567,5678,6789,12345]
 * 
 * Constraints:
 * 10 <= low <= high <= 10^9
 */

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list =  new ArrayList<>();
        int number = 12;
        int nextdigit=3;
        while(number<90){
            int counter = number;
            int counterdigit = nextdigit;
            while(counter <= high && counterdigit < 11){
                if(counter >= low) list.add(counter);
                counter = counter*10 + counterdigit;
                counterdigit++;
            }
            number+=11;
            nextdigit++;
        }
        Collections.sort(list);
        return list;
    }
}