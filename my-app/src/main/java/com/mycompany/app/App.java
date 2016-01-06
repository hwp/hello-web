package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
  private final long id;
  private final String content;

  public App(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}

