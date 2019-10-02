package com.vertex.newApp;

import io.vertx.core.AbstractVerticle;


public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {

    vertx.createHttpServer().requestHandler(req -> req.response().end("Hello World! this is my  app")).listen(8080);
  }

  }

