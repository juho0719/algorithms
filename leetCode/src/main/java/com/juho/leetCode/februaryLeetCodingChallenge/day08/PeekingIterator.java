package com.juho.leetCode.februaryLeetCodingChallenge.day08;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {

    private  Iterator<Integer> iterator;
    Integer forward;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        this.forward = iterator.hasNext() ? iterator.next() : null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return forward;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer tmp = forward;
        forward = this.iterator.hasNext() ? iterator.next() : null;
        return tmp;
    }

    @Override
    public boolean hasNext() {
        return forward != null;
    }
}
