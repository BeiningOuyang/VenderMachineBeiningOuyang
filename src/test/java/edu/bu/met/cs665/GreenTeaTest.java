package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreenTeaTest {
  public GreenTeaTest() {}

  @Test
  // test get and set drink name here
  public void testDrinkName() {
    GreenTea myDrink = new GreenTea(); // create a drink
    myDrink.brew(); // we call brew method to represents making this drink
    myDrink.setName("myGreenTea"); // set drink's name
    assertEquals("myGreenTea", myDrink.getName()); // get drink's name
  }

  @Test
  // test drink's price
  public void testDrinkPrice() {
    GreenTea myDrink = new GreenTea(); // create a drink
    myDrink.brew(); // we call brew method to represents making this drink
    assertEquals(2.50, myDrink.getPrice(), 0);
    // check getter method of drink's price
  }
}
