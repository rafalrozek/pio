package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static int value = -1;
    public static int capacity = 12;

    private int[] numbers = new int[capacity];

    public int total = value;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
