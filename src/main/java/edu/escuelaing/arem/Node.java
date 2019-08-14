package edu.escuelaing.arem;

/**
 * Class of a Node
 * @param <T>
 */
public class Node<T> {

    private Node<T> nextNode = null;
    private int id;
    private T data;

    /**
     * The constructor of a Node
     * @param data The data of that node
     */
    public Node(T data) {

        this.data = data;
    }

    /**
     * Give the next node
     * @return The next node
     */
    public Node nextNode() {

        return nextNode;
    }

    /**
     * Set the next node
     * @param node the node to replace the other one
     */
    public void setNextNode(Node<T> node) {

        this.nextNode= node;
    }

    /**
     * Set the id of the node
     * @param id the id to be changed
     */
    public void setId(int id) {

        this.id= id;
    }

    /**
     * Give the id
     * @return The id
     */
    public int getId() {

        return this.id;
    }

    /**
     * Give the data of the node
     * @return The data
     */
    public String getData() {

        return data.toString();
    }

    /**
     * Give the description of a node in a string
     * @return String with id and data description
     */
    @Override
    public String toString() {

        return "[id:"+this.id+", data:"+this.data +" ]";
    }
}

