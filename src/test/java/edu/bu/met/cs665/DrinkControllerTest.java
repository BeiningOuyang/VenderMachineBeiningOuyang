package edu.bu.met.cs665;

import org.junit.Test;

/** This is Junit test for DrinkController */
public class DrinkControllerTest {
  public DrinkControllerTest() {}

  @Test
  // test a drink example here
  public void TestDrink() {
    DrinkController myController = new DrinkController();
    myController.exampleDrink();
  }
}
