package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int INT = -1;
    Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return INT;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return INT;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
