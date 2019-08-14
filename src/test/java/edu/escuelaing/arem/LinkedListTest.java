package edu.escuelaing.arem;

import org.junit.Test;

public class LinkedListTest {

    /**
     * Test to add a node into the linkedList
     */
    @Test
    public void addToLinkedList() {

        LinkedList linkedList = new LinkedList();

        linkedList.addNode(1, new Node(1));
        linkedList.addNode(1, new Node(2.5));
        linkedList.addNode(1,new Node(2.3));
        linkedList.addNode(1,new Node(2));
        linkedList.addNode(2,new Node(2.1));

        try{

            assert(linkedList.nextNode(3).getData().equals("2.3"));
            assert(linkedList.nextNode(1).getData().equals("2"));
            assert(linkedList.nextNode(4).getData().equals("2.5"));
            assert(linkedList.priorNode(2).getData().equals("1"));
        } catch (Exception e) {
        }
    }

    /**
     * Test to remove a node into the linkedList
     */
    @Test
    public void removeToLinkedList() {

        LinkedList linkedList = new LinkedList();

        linkedList.addNode(1, new Node(1));
        linkedList.addNode(1, new Node(2.5));
        linkedList.addNode(1,new Node(2.3));
        linkedList.addNode(1,new Node(2));
        linkedList.addNode(2,new Node(2.1));

        try {
            linkedList.removeNode(3);
            assert(linkedList.nextNode(2).getData().equals("2.3"));
            linkedList.removeNode(1);
            assert(linkedList.priorNode(2).getData().equals("2"));
            linkedList.removeNode(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
