package com.juho.leetCode.challenge.y2022.month02.day22;

/**
 * Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.
 * 
 * Example 1:
 * Input: columnTitle = "A"
 * Output: 1
 * 
 * Example 2:
 * Input: columnTitle = "AB"
 * Output: 28
 * 
 * Example 3:
 * Input: columnTitle = "ZY"
 * Output: 701
 * 
 * Constraints:
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        return s.length()==0?0:(s.charAt(s.length()-1)-'A'+1)+26*titleToNumber(s.substring(0, s.length()-1));
    }
}