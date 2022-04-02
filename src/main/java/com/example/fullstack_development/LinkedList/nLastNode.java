package com.example.fullstack_development.LinkedList;

import com.example.fullstack_development.DoublyLinkedList.Node;
import java.util.LinkedList;

public class nLastNode {

    public static void main(String []args) {
        // Use this to test your code:
        LinkedList ll = createList();

        Node n = nthLastNode(ll, 9);
        System.out.print(n.data);
    }

    public static Node nthLastNode(LinkedList list, int n) {
        // Create your method here:
        return null;
    }

    public static LinkedList createList() {
        LinkedList list = new LinkedList();
        for (int i = 50; i >= 1; i--) {
//            list.addToTail(i);
        }
        return list;
    }
}
