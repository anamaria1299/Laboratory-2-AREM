package edu.escuelaing.arem;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.text.DecimalFormat;

public class Service {

    public static JsonObject getResult(JsonArray numbers) throws Exception {

        LinkedList linkedList = new LinkedList();

        for(int i= 0; i < numbers.size(); i++) {

            linkedList.addNode(1, new Node(numbers.get(i)));
        }

        DecimalFormat decim = new DecimalFormat("0.00");

        Double meanD = App.calculateMean(linkedList);
        String mean = decim.format(meanD);
        String sDeviation = decim.format(App.calculateStandardDeviation(linkedList, meanD));

        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("mean", String.valueOf(mean));
        jsonObject.addProperty("standard deviation", String.valueOf(sDeviation));
        return jsonObject;
    }
}
