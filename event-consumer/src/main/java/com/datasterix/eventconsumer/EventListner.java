package com.datasterix.eventconsumer;
import static spark.Spark.*;

/**
 * Created by santanu on 28/2/16.
 */

public class EventListner {

    public static void main(String[] args) {
        get("/events", (request, response) -> {
            return "Number of splat parameters: " + request.splat().length;
        });

        post("/events", (request, response) -> {
            return "Number of splat parameters: " + request.splat().length;
        });
    }


}
