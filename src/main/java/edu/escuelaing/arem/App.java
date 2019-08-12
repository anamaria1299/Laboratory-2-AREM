package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        LinkedList linkedList = new LinkedList();

        linkedList.addNode(1, new Node(1));

        linkedList.addNode(1, new Node(2.5));
        linkedList.addNode(1,new Node(2.3));
        linkedList.addNode(1,new Node(2));
        linkedList.addNode(2,new Node(2.1));
        System.out.println(linkedList.getLinkedList());
    }
}
