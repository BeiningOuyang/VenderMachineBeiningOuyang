package edu.bu.met.cs665;

public class Tea extends Drink {

  /** Tea class inherits Drink class. */
  public Tea() {
    this.setPrice(1.00);
  } // price of water and cup

  /** here we override the brew method in Drink to make tea. */
  @Override
  public void brew() {
    System.out.println("Making your Tea");
    // this brew function represents process like:
    // add boil water to cup, preparing tea bags, etc.
  }
}
