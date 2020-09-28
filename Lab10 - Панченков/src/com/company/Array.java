package com.company;

public class Array <E> {
    private E[] a;
    E getElem(int i) {
        return a[i];
    }
    public void set_A(E[] a) {
        this.a = a;
    }
    public int getLength() {
        return a.length;
    }
}
