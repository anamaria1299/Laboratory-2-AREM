package edu.escuelaing.arem;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Build the linkedList for first case
     * @return The linkedList
     */
    private LinkedList buildFirstCase() {

        LinkedList list = new LinkedList();
        list.addNode(1, new Node(160));
        list.addNode(1, new Node(591));
        list.addNode(1, new Node(114));
        list.addNode(1, new Node(229));
        list.addNode(1, new Node(230));
        list.addNode(1, new Node(270));
        list.addNode(1, new Node(128));
        list.addNode(1, new Node(1657));
        list.addNode(1, new Node(624));
        list.addNode(1, new Node(1503));
        return list;
    }

    /**
     * Build the linkedList for second case
     * @return The linkedList
     */
    private LinkedList buildSecondCase() {

        LinkedList list = new LinkedList();
        list.addNode(1, new Node(15.0));
        list.addNode(1, new Node(69.9));
        list.addNode(1, new Node(6.5));
        list.addNode(1, new Node(22.4));
        list.addNode(1, new Node(28.4));
        list.addNode(1, new Node(65.9));
        list.addNode(1, new Node(19.4));
        list.addNode(1, new Node(198.7));
        list.addNode(1, new Node(38.8));
        list.addNode(1, new Node(138.2));
        return list;
    }

    /**
     * Test the calculation of the mean
     */
    @Test
    public void calculateMeanTest() {

        try {
            double mean1 = App.calculateMean(buildFirstCase());
            double mean2 = App.calculateMean(buildSecondCase());
            Assert.assertEquals(550.6, mean1, 2);
            Assert.assertEquals(60.32, mean2, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Test the calculation of the standard Deviation
     */
    @Test
    public void calculateStandardDeviationTest() {

        try {
            double mean1 = App.calculateMean(buildFirstCase());
            double mean2 = App.calculateMean(buildSecondCase());

            double sDeviation1 = App.calculateStandardDeviation(buildFirstCase(), mean1);
            double sDeviation2 = App.calculateStandardDeviation(buildSecondCase(), mean2);
            Assert.assertEquals(572.03, sDeviation1, 2);
            Assert.assertEquals(62.26, sDeviation2, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
