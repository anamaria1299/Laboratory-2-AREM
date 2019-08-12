package edu.escuelaing.arem;

import java.util.*;

public class LinkedList {

    //TODO handle exceptions

    private HashMap<Integer,Node> nodes = new HashMap<Integer, Node>();

    public LinkedList() { }

    public Node addNode(int id, Node node) {

        if(nodes.size() == 0) {
            nodes.put(id, node);
            node.setId(1);
            return node;
        }
        Node actualNode = setNextNode(id, node);

        return actualNode;
    }

    private Node setNextNode(int id, Node node) {

        Node actualNode = nodes.get(id);
        Node nextNode = actualNode.nextNode();
        actualNode.setNextNode(node);
        node.setNextNode(nextNode);
        node.setId(id+1);
        if(nextNode!=null) nextNode.setId(id+2);
        refactorNodesHashMap();

        return actualNode;
    }

    private void refactorNodesHashMap() {

        Node next= nodes.get(1);
        Node prev= null;
        nodes.clear();

        while(next != null) {

            if (prev != null) {
                next.setId(prev.getId() + 1);
            } else {
                next.setId(1);
            }
            nodes.put(next.getId(), next);
            prev = next;
            next= next.nextNode();
        }
    }

    public void removeNode(int id) throws Exception {

        validateId(id);
        if(nodes.size() == 1) {
            nodes.clear();
            return;
        }
        if(id == 1) {
            Node nextNode = nodes.get(id).nextNode();
            nextNode.setId(1);
            nodes.put(id, nextNode);
            refactorNodesHashMap();
            return;
        }
        nodes.get(id-1).setNextNode(nodes.get(id).nextNode());
        refactorNodesHashMap();
    }

    public Node nextNode(int id) throws Exception {

        validateId(id);
        return nodes.get(id).nextNode();
    }

    public Node priorNode(int id) {

        return nodes.get(id-1);
    }

    private void validateId(int id) {

        if(!nodes.containsKey(id)) {
            throw new IllegalArgumentException("There is not node with id: ["+id+"]");
        }
    }

    public HashMap<Integer, Node> getLinkedList() {

        return nodes;
    }

    public int getSize() {

        return nodes.size();
    }
}

