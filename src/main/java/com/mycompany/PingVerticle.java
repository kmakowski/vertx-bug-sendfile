package com.mycompany;


import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

/*
This is a simple Java verticle which receives `ping` messages on the event bus and sends back `pong` replies
 */
public class PingVerticle extends Verticle {

  public void start() {

    vertx.createHttpServer()
            .requestHandler((HttpServerRequest req) -> {
                req.response().sendFile("mod.json");
            })
            .listen(8080);

      System.out.println("s");

    container.logger().info("PingVerticle started");

  }
}
