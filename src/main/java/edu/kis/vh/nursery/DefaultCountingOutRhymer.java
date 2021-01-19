package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 11;
    public static final int INT2 =-1;
    public static final int SIZE= 12;
    private int[] numbers = new int[SIZE];


    public int total = INT2;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INT2;
    }

    public boolean isFull() {
        return total == INT;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT2;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INT2;
        return numbers[total--];
    }

}
