package com.company;

public abstract class AbstractQueue implements Queue{
    protected int size = 0;
    protected abstract void enqueueElem(Object element);
    protected abstract Object elementElem();
    protected abstract void dequeueElem();
    protected abstract void pushElem(Object element);
    protected abstract Object peekElem();
    protected abstract void removeElem();

    public void enqueue(Object element) {
        assert element != null;
        enqueueElem(element);
        size++;
    }

    public Object element() {
        assert size > 0;
        return elementElem();
    }

    public Object dequeue() {
        assert size > 0;
        Object result = elementElem();
        dequeueElem();
        --size;
        return result;
    }

    public void push(Object element) {
        System.out.println("Push");
        assert element != null;
        pushElem(element);
        size++;
    }

    public Object peek() {
        assert size > 0;
        return peekElem();
    }

    public Object remove() {
        assert size > 0;
        Object result = peek();
        removeElem();
        --size;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    public Object[] toArray() {
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = dequeue();
            enqueue(newArray[i]);
        }
        return newArray;
    }
}