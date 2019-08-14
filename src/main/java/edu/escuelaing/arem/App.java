package edu.escuelaing.arem;

import java.util.Scanner;

/**
 * App to calculate mean and standard deviation
 *
 */
public class App {

    public static void main( String[] args ) throws Exception {

        LinkedList linkedList = new LinkedList();

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the size of the list:");
        int n= Integer.parseInt(reader.next());
        System.out.printf("Enter the %d numbers:\n", n);
        while (n!=0) {
            linkedList.addNode(1, new Node(reader.next()));
            n--;
        }

        double mean = calculateMean(linkedList);
        double sDeviation = calculateStandardDeviation(linkedList, mean);
        System.out.printf("Mean: %.2f \n", mean);
        System.out.printf("Standard deviation: %.2f \n", sDeviation);
    }

    /**
     * Calculate the mean of a list of numbers
     * @param list The linkedList
     * @return The mean
     * @throws Exception Throw an exception when an id of a node does not exist
     */
    public static double calculateMean(LinkedList list) throws Exception {

        try {
            Node node = list.getHead();
            double mean = Double.parseDouble(node.getData());
            int size = 1;

            while(node.nextNode()!= null) {

                mean+= Double.parseDouble(list.nextNode(node.getId()).getData());
                node = node.nextNode();
                size++;
            }

            return mean/size;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    }

    /**
     * Calculate the standard deviation of a given list
     * @param list The linkedList
     * @param mean The mean used to calculate the deviation
     * @return The standard deviation
     * @throws Exception Throw an exception when an id of a node does not exist
     */
    public static double calculateStandardDeviation(LinkedList list, double mean) throws Exception {

        try {
            Node node = list.getHead();
            double sDeviation= Math.pow(Double.parseDouble(node.getData()) - mean, 2);
            int size = 0;

            while(node.nextNode()!= null) {

                sDeviation+= Math.pow(Double.parseDouble(list.nextNode(node.getId()).getData()) - mean, 2);
                node = node.nextNode();
                size++;
            }

            return Math.pow(sDeviation/size, 0.5);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }
    }
}
