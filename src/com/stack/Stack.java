package com.stack;

public class Stack {

    private int length = 0;
    private Node top = null;

    public void push(int item) {
        Node node = new Node(item);

        if (top != null) {
            node.next = top;
        }

        top = node;
        length++;
    }

    public int pop() {
        int result = -1;

        if(top != null) {
            result = top.data;
            top = top.next;
            length--;
        }

        return result;
    }

    public int peekMin() {
        int min = 0;

        if(top != null)
            min = top.data;

        for (int i = 0; i < size() - 1; i++) {
            top = top.next;

            if (min > top.data)
                min = top.data;
        }

        return min;
    }

    public int size() {
        return length;
    }

    private class Node {
        private Node next = null;
        private int data = 0;

        private Node(int value) {
            this.data = value;
        }
    }
}
