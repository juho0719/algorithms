package com.juho.leetCode.challenge.y2021.month02.day05;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {

    public String simplifyPath(String path) {
        Deque<String> deque = new ArrayDeque<>();
        String[] spl = path.split("/");

        for(String sp : spl) {
            if(sp.equals("") || sp.equals(".")) continue;
            if(sp.equals("..")) {
                if(deque.size() > 0) {
                    deque.pollLast();
                }
            } else {
                deque.add(sp);
            }
        }

        StringBuilder sb = new StringBuilder();
        if(deque.isEmpty()) return "/";

        while(!deque.isEmpty()) {
            sb.append("/").append(deque.pollFirst());
        }
        return sb.toString();
    }
}
