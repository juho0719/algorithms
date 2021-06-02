package com.juho.leetCode.challenge.month01.day10;

public class CreateSortedArrayThroughInstructions {

    class FenwickTree {
        int[] tree;
        public FenwickTree(int num) {
            this.tree = new int[num+1];
        }

        public void insert(int position, int value) {
            while(position < tree.length) {
                tree[position] += value;
                position += position & -position;
            }
        }

        public int sum(int position) {
            int sum = 0;
            while(position > 0) {
                sum += tree[position];
                position -= position & -position;
            }
            return sum;
        }
    }
    public int createSortedArray(int[] instructions) {
        FenwickTree ft = new FenwickTree(100001);
        int result = 0;
        for(int i=0; i<instructions.length; i++) {
            int left = ft.sum(instructions[i] - 1);
            int right = i - ft.sum(instructions[i]);
            result += Math.min(left, right);
            result %= 1000000007;
            ft.insert(instructions[i], 1);
        }
        return result;
    }
}