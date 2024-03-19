package coe528.lab4;

import java.util.ArrayList;
public class Queue<T> {
    // Overview: Queues are mutable, bounded
    // collection of elements that operate in
    // FIFO (First-In-First-Out) order.

    // The abstraction function is:
    // A.F(c) = {c.items.get(i) | 0 <= i < c.items.size()}

    // The rep invariant is:
    // c.items != null &&
    // for all 0 <= i < c.items.size() (c.items.get(i) != null)


    private ArrayList<T> items;

    public Queue() {
        // EFFECTS: Creates a new Queue object
        items = new ArrayList<T>();
    }

    public void enqueue(T element) {
        // MODIFIES: this
        // EFFECTS: Appends the element at the end of the queue
        items.add(element);
    }

    public T dequeue() throws Exception{
        // MODIFIES: this
        // EFFECTS: Removes an element from the front of the queue
        if (items.isEmpty()) throw new Exception("Queue is empty");
        return items.removeFirst();
    }

    public boolean isEmpty(){
        // EFFECTS: Returns true if the queue is empty; otherwise returns false
        return items.isEmpty();
    }

    public boolean repOK(){
        // EFFECTS: Returns true if the rep invariant holds for this
        // object; otherwise returns false
        if (items == null) return false;
        for (T item : items) {
            if (item == null) return false;
        }
        return true;
    }

    public String toString(){
        // EFFECTS: Returns a string that contains the elements in the
        // queue. Implements the abstraction function.
        return items.toString();
    }

}

