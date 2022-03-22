package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** This is Junit test for Americano */
public class CoffeeTest {
  public CoffeeTest() {}

  @Test
  // test get and set drink name here
  public void testDrinkName() {
    Coffee myDrink = new Coffee(); // create a drink
    myDrink.brew(); // we call brew method to represents making this drink
    myDrink.setName("myCoffee"); // set drink's name
    assertEquals("myCoffee", myDrink.getName()); // get drink's name
  }

  @Test
  // test add condiments here
  public void testAddCondiments() {
    Coffee myDrink = new Coffee(); // create a drink
    myDrink.brew(); // we call brew method to represents making this drink
    myDrink.addMilk(); // try to add 4 milk
    myDrink.addMilk();
    myDrink.addMilk();
    myDrink.addMilk(); // should print out reach maximum, only 3 milk allowed
    myDrink.addSugar(); // add 1 sugar
    myDrink.getMilkUnit(); // test getter for how many milk added
    myDrink.getSugarUnit(); // test getter for how much sugar added
    assertEquals(4, myDrink.getTotalNumOfCondiments());
    // test getter for how many condiments added totally.
  }

  @Test
  public void testDrinkPrice() {
    Coffee myDrink = new Coffee();
    myDrink.brew(); // we call brew method to represents making this drink
    assertEquals(1.00, myDrink.getPrice(), 0);
    myDrink.addMilk(); // add one milk, price should increase 0.05
    myDrink.addMilk(); // add one more milk, price should increase 0.05
    assertEquals(1.1, myDrink.getFinalPrice(), 0);
  }
}
