package edu.escuelaing.arem;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

import static spark.Spark.*;

public class SparkWebApp {

    public static void main(String[] args) {

        post("operation", (req, res) -> {

            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            res.type("application/json");
            return Service.getResult(jsonObject.get("value").getAsJsonArray());
        });

        get("operation", (req, res) -> {

            String page = FileUtils.readFileToString(new File("src/main/java/edu/escuelaing/arem/resources/index.html"), StandardCharsets.UTF_8);
            return page;
        });
    }
}
