package com.juho.leetCode.challenge.month02.day16;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        if(S.length() == 0){
            return ans;
        }
        permutation(S.toCharArray(), ans, 0);
        return ans;
    }

    private void permutation(char[] str, List<String> ans, int index){
        if(index == str.length){
            ans.add(new String(str));
            return ;
        }

        if(Character.isDigit(str[index])){
            permutation(str, ans, index+1);
            return ;
        } else{
            str[index] = Character.toLowerCase(str[index]);
            permutation(str, ans, index+1);


            str[index] = Character.toUpperCase(str[index]);
            permutation(str, ans, index+1);
        }
    }
}
