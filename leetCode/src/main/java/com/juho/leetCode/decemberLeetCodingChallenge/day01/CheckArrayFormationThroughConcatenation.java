package com.juho.leetCode.decemberLeetCodingChallenge.day01;

public class CheckArrayFormationThroughConcatenation {

    private boolean canFormArrayV1(int[] arr, int[][] pieces) {
        List<Integer> arrList = new ArrayList<>();
        Map<Integer, Integer> arrMap = new HashMap<>();

        Arrays.stream(arr).forEach(e -> {
            arrList.add(e);
            arrMap.put(e, arrList.size()-1);
        });

        for(int i=0; i<pieces.length; i++) {
            if(pieces[i].length == 1) {
                if(arrMap.containsKey(pieces[i][0])) continue;
                else return false;
            } else {
                Integer index = arrMap.get(pieces[i][0]);
                if(index == null) return false;
                for(int j=0; j<pieces[i].length; j++) {
                    if(index+j == arrList.size()) return false;
                    if(arrList.get(index+j) == pieces[i][j]) continue;
                    else return false;
                }
            }
        }
        return true;
    }

    public boolean canFormArrayV2(int[] arr, int[][] pieces) {
        Map<Integer, Integer> arrMap = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            arrMap.put(arr[i], i);
        }

        for(int i=0; i<pieces.length; i++) {
            if(!arrMap.containsKey(pieces[i][0])) return false;

            int arrStartIndex = arrMap.get(pieces[i][0]) + 1;
            for(int j=1; j<pieces[i].length; j++) {
                if(arrStartIndex == arr.length || pieces[i][j] != arr[arrStartIndex]) return false;
                arrStartIndex++;
            }
        }
        return true;
    }
}