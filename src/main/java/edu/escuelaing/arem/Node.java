package edu.escuelaing.arem;

public class Node<T> {

    private Node<T> nextNode = null;
    private int id;
    private T node;

    public Node(T node) {

        this.node= node;
    }

    public Node nextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> node) {

        this.nextNode= node;
    }

    public void setId(int id) {

        this.id= id;
    }

    public int getId() {

        return this.id;
    }

    public T getNode() {

        return node;
    }

    @Override
    public String toString() {

        return "[id:"+this.id+", node:"+this.node+" ]";
    }
}

