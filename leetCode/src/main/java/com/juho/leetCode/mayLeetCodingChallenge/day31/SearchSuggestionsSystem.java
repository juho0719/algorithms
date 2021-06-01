package com.juho.leetCode.mayLeetCodingChallenge.day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        Arrays.sort(products);

        for(int i=0; i<searchWord.length(); i++) {
            List<String> threeWords = new ArrayList<>();
            String splitChar = searchWord.substring(0, i+1);
            for(int j=0; j<products.length; j++) {
                if(threeWords.size() == 3) break;
                if(products[j].startsWith(splitChar)) {
                    threeWords.add(products[j]);
                }
            }
            result.add(threeWords);
        }
        return result;
    }

}
