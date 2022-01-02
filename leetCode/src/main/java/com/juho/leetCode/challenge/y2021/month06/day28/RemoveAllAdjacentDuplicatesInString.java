package com.juho.leetCode.challenge.y2021.month06.day28;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}