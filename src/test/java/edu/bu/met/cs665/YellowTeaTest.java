package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YellowTeaTest {
  public YellowTeaTest() {}

  @Test
  // test get and set drink name here
  public void testDrinkName() {
    YellowTea myDrink = new YellowTea(); // create a drink
    myDrink.brew();// we call brew method to represents making this drink
    myDrink.setName("myYellowTea"); // set drink's name
    assertEquals("myYellowTea", myDrink.getName()); // get drink's name
  }

  @Test
  // test drink's price
  public void testDrinkPrice() {
    YellowTea myDrink = new YellowTea(); // create a drink
    myDrink.brew();// we call brew method to represents making this drink
    assertEquals(2.75, myDrink.getPrice(), 0);
    // check getter method of drink's price
  }
}
