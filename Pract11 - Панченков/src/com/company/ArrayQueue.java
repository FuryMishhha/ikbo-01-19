package com.company;

public class ArrayQueue extends AbstractQueue {
    private final int s = 100;
    private Object arr[];
    private int head;
    private int tail;

    public ArrayQueue() {
        arr = new Object[s];
        head = tail = 0;
    }

    private void ensureS(int s) {
        if (s >= arr.length) {
            Object[] temp = new Object[arr.length << 1];
            int count = tail < head ? arr.length - head : size;
            System.arraycopy(arr, head, temp, 0, count);
            if (tail < head)
                System.arraycopy(arr, 0, temp, count, tail);
            arr = temp;
            head = 0;
            tail = size;
        }

    }

    protected void enqueueElem(Object element) {
        ensureS(size + 1);
        arr[tail] = element;
        tail = (tail + 1) % arr.length;
    }

    public Object elementElem() {
        return arr[head];
    }

    protected void dequeueElem() {
        arr[head] = null;
        head = (head + 1) % arr.length;
    }

    protected void pushElem(Object element) {
        ensureS(size + 1);
        head = (this.head - 1 >= 0) ? arr.length - 1 : head - 1;
        arr[head] = element;
    }

    protected Object peekElem() {
        return arr[(tail == 0) ? arr.length - 1 : tail - 1];
    }

    protected void removeElem() {
        tail = tail == 0 ? arr.length - 1 : --tail;
        arr[tail] = null;
    }
}