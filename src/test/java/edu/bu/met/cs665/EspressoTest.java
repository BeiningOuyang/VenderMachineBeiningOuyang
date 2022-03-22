package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EspressoTest {
  public EspressoTest() {}

  @Test
  // test get and set drink name here
  public void testDrinkName() {
    Espresso myDrink = new Espresso(); // create a drink
    myDrink.brew(); // we call brew method to represents making this drink
    myDrink.setName("myEsp"); // set drink's name
    assertEquals("myEsp", myDrink.getName()); // get drink's name
  }

  @Test
  // test add condiments here
  public void testAddCondiments() {
    Espresso myDrink = new Espresso(); // create a drink
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
    Espresso myDrink = new Espresso();
    myDrink.brew(); // we call brew method to represents making this drink
    assertEquals(3.25, myDrink.getPrice(), 0);
    myDrink.addMilk(); // add one milk, price should increase 0.05
    myDrink.addMilk(); // add one more milk, price should increase 0.05
    // final price should be 3.25 + 0.05 + 0.05 = 3.35
    assertEquals(3.35, myDrink.getFinalPrice(), 0);
  }
}
