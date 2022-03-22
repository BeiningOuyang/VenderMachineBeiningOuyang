package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackTeaTest {
  public BlackTeaTest() {}

  @Test
  // test get and set drink name here
  public void testDrinkName() {
    BlackTea myDrink = new BlackTea(); // create a drink
    myDrink.brew(); // we call brew method to represents making this drink
    myDrink.setName("myBlackTea"); // set drink's name
    assertEquals("myBlackTea", myDrink.getName()); // get drink's name
  }

  @Test
  // test drink's price
  public void testDrinkPrice() {
    BlackTea myDrink = new BlackTea(); // create a drink
    myDrink.brew(); // we call brew method to represents making this drink
    assertEquals(2.25, myDrink.getPrice(), 0);
    // check getter method of drink's price
  }
}
