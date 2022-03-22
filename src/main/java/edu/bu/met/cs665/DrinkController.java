package edu.bu.met.cs665;

/** this class works as a main class to run this whole homework as an example. */
public class DrinkController {

  private VendMachine myMachine;

  /** This represents we got a vendMachine called myMachine. */
  public DrinkController() {
    myMachine = new VendMachine();
  }

  /** this represents that we are making an example drink. */
  public void exampleDrink() {
    Coffee myDrink = myMachine.coffee[0]; // Make an Espresso
    myDrink.brew(); // we call brew method to represents making this drink
    myDrink.setName("myEpso"); // Make an Espresso and name it as Epso
    myDrink.addSugar(); // Add one sugar;
    myDrink.addSugar(); // Add one more sugar
    myDrink.addSugar(); // Add one more sugar
    myDrink.addSugar(); // Add one more sugar,should reach maximum
    myDrink.addMilk(); // Add one milk
    myDrink.getFinalPrice(); // Get final price
    myDrink.getTotalNumOfCondiments(); // get num of total condiments added
  }
}
