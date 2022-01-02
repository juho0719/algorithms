package com.juho.leetCode.challenge.y2021.month11.day07;

/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * 
 * Example 1:
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 * 
 * Example 2:
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 * 
 * Constraints:
 * 1 <= num1.length, num2.length <= 200
 * num1 and num2 consist of digits only.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        StringBuilder firstNumber = new StringBuilder(num1);
        StringBuilder secondNumber = new StringBuilder(num2);
        
        firstNumber.reverse();
        secondNumber.reverse();
        
        int N = firstNumber.length() + secondNumber.length();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; ++i) {
            answer.append(0);
        }
        
        for (int place2 = 0; place2 < secondNumber.length(); place2++) {
            int digit2 = secondNumber.charAt(place2) - '0';
            
            for (int place1 = 0; place1 < firstNumber.length(); place1++) {
                int digit1 = firstNumber.charAt(place1) - '0';
                int currentPos = place1 + place2;
                int carry = answer.charAt(currentPos) - '0';
                int multiplication = digit1 * digit2 + carry;
                
                answer.setCharAt(currentPos, (char)(multiplication % 10 + '0'));
                
                int value = (answer.charAt(currentPos + 1) - '0') + multiplication / 10;
                answer.setCharAt(currentPos + 1, (char)(value + '0'));
            }
        }
        if (answer.charAt(answer.length() - 1) == '0') {
            answer.deleteCharAt(answer.length() - 1);
        }
        answer.reverse();
        return answer.toString();
    }
}