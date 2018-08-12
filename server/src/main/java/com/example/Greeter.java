package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * @param someone Name of the person we want to greet
  * @return String with greeting message
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
