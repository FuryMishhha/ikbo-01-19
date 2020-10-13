package com.company;

public class LinkedQueue extends AbstractQueue {
    private Node tail;
    private Node head;

    protected void enqueueElem(Object element) {
        tail = new Node(element, null, tail);
        if (head == null)
            head = tail;
        else
            tail.next.prev = tail;
    }

    protected Object elementElem() {
        return head.value;
    }

    protected void dequeueElem() {
        if (head.prev != null) head.prev.next = null;
        head = head.prev;
    }

    protected void pushElem(Object element) {
        head = new Node(element, head, null);
        if (tail == null)
            tail = head;
        else
            head.prev.next = head;

    }

    protected Object peekElem() {
        return tail.value;
    }

    protected void removeElem() {
        tail = tail.next;
        if (tail != null)
            tail.prev = null;
    }

    private class Node {
        Object value;
        Node prev;
        Node next;

        Node(Object element, Node prev, Node next) {
            value = element;
            this.prev = prev;
            this.next = next;
        }
    }
}