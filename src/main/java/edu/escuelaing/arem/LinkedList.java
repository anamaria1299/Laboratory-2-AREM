package edu.escuelaing.arem;

import java.util.ArrayList;
import java.util.List;

/**
 * LinkedList class
 */
public class LinkedList {

    private Node head= null;

    /**
     * constructor of the linked list
     */
    public LinkedList() { }

    /**
     * Add a Node to the linked list
     * @param id The position where the node is going to be added
     * @param node The node to be added
     * @return The node added to the linked list
     */
    public Node addNode(int id, Node node) {

        if(head==null) {
            node.setId(1);
            head= node;
            return node;
        }
        Node actualNode = setNextNode(id, node);

        return actualNode.nextNode();
    }

    /**
     * Set the next node of an specific node with a given id
     * @param id The given id to identify the node
     * @param node The node that is going to replace the next node
     * @return The node of the given id with the modifications
     */
    private Node setNextNode(int id, Node node) {

        Node actualNode = searchNodeById(id);
        Node nextNode = actualNode.nextNode();
        actualNode.setNextNode(node);
        node.setNextNode(nextNode);
        node.setId(id+1);
        if(nextNode!=null) nextNode.setId(id+2);
        refactorNodes();

        return actualNode;
    }

    /**
     * Refactor the id of the nodes, when a node has been changed
     */
    private void refactorNodes() {

        Node next= searchNodeById(1);
        Node prev= null;

        while(next != null) {

            if (prev != null) {
                next.setId(prev.getId() + 1);
            } else {
                head= next;
                next.setId(1);
            }
            prev = next;
            next= next.nextNode();
        }
    }

    /**
     * Remove an specific node given its id
     * @param id The id to identify the node to remove
     * @throws Exception Throws an exception if the node with the given id does not exist
     */
    public void removeNode(int id) throws Exception {

        if(head.nextNode() == null) {
            head= null;
            return;
        }
        if(id == 1) {
            head.nextNode().setId(1);
            head= head.nextNode();
            refactorNodes();
            return;
        }
        searchNodeById(id-1).setNextNode(searchNodeById(id).nextNode());
        refactorNodes();
    }

    /**
     * Give the next node of an specific node given its id
     * @param id The id to identify the node
     * @return The next node of the node given its id
     * @throws Exception Throws an exception if the node with the given id does not exist
     */
    public Node nextNode(int id) throws Exception {

        return searchNodeById(id).nextNode();
    }

    /**
     * Give the prior node of an specific node given its id
     * @return The next node of the node given its id
     * @throws Exception Throws an exception if the node with the given id does not exist
     */
    public Node priorNode(int id) throws Exception {

        return searchNodeById(id-1);
    }

    /**
     * Search a node for id since the head or the queue
     * @param id The given id to search the node
     * @return The node of the given id
     * @throws IllegalArgumentException Throws an exception if the node with the given id does not exist
     */
    private Node searchNodeById(int id) throws IllegalArgumentException{

        Node node = head;
        while(node != null) {
            if(node.getId()==id) {
                return node;
            }
            node= node.nextNode();
        }
        throw new IllegalArgumentException("There is not node with id: " + id);
    }

    /**
     * Give the linked list
     * @return A list with the nodes
     */
    public List getLinkedList() {

        Node node= head;
        ArrayList<Node> linkedList = new ArrayList<Node>();

        while (node!=null) {
            linkedList.add(node);
            node= node.nextNode();
        }

        return linkedList;
    }

    /**
     * Give the head
     * @return The head
     */
    public Node getHead() {

        return head;
    }
}

