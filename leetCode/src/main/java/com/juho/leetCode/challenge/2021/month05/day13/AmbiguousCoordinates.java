package com.juho.leetCode.challenge.month05.day13;

import java.util.ArrayList;
import java.util.List;

public class AmbiguousCoordinates {
    public List<String> ambiguousCoordinates(String s) {
        List<String> ans = new ArrayList<>();
        for (int i = 2; i < s.length()-1; ++i)
            for (String left: make(s, 1, i))
                for (String right: make(s, i, s.length()-1))
                    ans.add("(" + left + ", " + right + ")");
        return ans;
    }

    public List<String> make(String s, int i, int j) {
        // Make on S.substring(i, j)
        List<String> ans = new ArrayList<>();
        for (int d = 1; d <= j-i; ++d) {
            String left = s.substring(i, i+d);
            String right = s.substring(i+d, j);
            if ((!left.startsWith("0") || left.equals("0"))
                    && !right.endsWith("0"))
                ans.add(left + (d < j-i ? "." : "") + right);
        }
        return ans;
    } 
}
