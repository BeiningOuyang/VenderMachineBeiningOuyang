package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** This is Junit test for Americano */
public class TeaTest {
  public TeaTest() {}

  @Test
  // test get and set drink name here
  public void testDrinkName() {
    Tea myDrink = new Tea(); // create a drink
    myDrink.brew();// we call brew method to represents making this drink
    myDrink.setName("myTea"); // set drink's name
    assertEquals("myTea", myDrink.getName()); // get drink's name
  }

  @Test
  public void testDrinkPrice() {
    Tea myDrink = new Tea();
    myDrink.brew();// we call brew method to represents making this drink
    assertEquals(1.00, myDrink.getPrice(), 0);
  }
}
