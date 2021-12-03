package com.main;

import com.stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(3);
        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println("Size of stack before peek: " + stack.size());
        System.out.println("Min. element: " + stack.peekMin());
        System.out.println("Size of stack after peek: " + stack.size());
    }
}
