/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coe528.lab4;

import java.util.ArrayList;
public class StackOfDistinctStrings {

    // Overview: StacksOfDistinctStrings are mutable, bounded
    // collection of distinct strings that operate in
    // LIFO (Last-In-First-Out) order.

// The abstraction function is:
// a) Write the abstraction function here
// A.F(c) = {c.items.get(i) | 0 <= i < c.items.size()}

// The rep invariant is:
    // 1. The 'items' collection is not null.
    // 2. All elements in the 'items' collection are not null.
    // 3. All elements in the 'items' collection are distinct.
// b) Write the rep invariant here

// c.items != null &&
// for all 0 <= i < c.items.size() (c.items.get(i) != null &&
// for all 0 <= i < c.items.size() {
//      for all 0 <= j < c.items.size() {
//          (c.items.get(i) != c.items.get(j))
//      }
// }



//the rep
    private ArrayList<String> items;
    // constructor
    public StackOfDistinctStrings() {
// EFFECTS: Creates a new StackOfDistinctStrings object
        items = new ArrayList<String>();
    }
    public void push(String element) throws Exception {
// MODIFIES: this
// EFFECTS: Appends the element at the top of the stack
// if the element is not in the stack, otherwise
// does nothing.
        if(element == null) throw new Exception();
        if(false == items.contains(element))
            items.add(element);
    }
    public String pop() throws Exception {
// MODIFIES: this
// EFFECTS: Removes an element from the top of the stack
        if (items.size() == 0) throw new Exception();
        return items.remove(items.size()-1);
    }
    public boolean repOK() {
// EFFECTS: Returns true if the rep invariant holds for this
// object; otherwise returns false
// c) Write the code for the repOK() here
        if (items == null) return false; //the 'items' collection is not null
        for (String item : items) {
            if (item == null) return false; // the elements in the 'items' collection are not null
        }
        for (int i = 0; i < items.size(); i++) { // the elements in the 'items' collection are distinct
            for (int j = 0; j < items.size(); j++) {
                if (i != j && items.get(i).equals(items.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }
    public String toString() {
// EFFECTS: Returns a string that contains the strings in the
// stack and the top element. Implements the
// abstraction function.
// d) Write the code for the toString() here
        String result = "{ ";
        if (items.isEmpty()) {
            return "Stack is empty";
        } else {
            for (String item : items) {
                result += item + " ";
            }
        }
        result += "} The top element is " + items.getLast();
    return result;
    }
    // or  return items.toString();
    // if only the top element is needed to be printed
    // return items.get(items.size()-1);
    //or return items.getLast();
}

