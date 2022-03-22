package edu.bu.met.cs665;

public class VendMachine {

  /**
   * The VenMachine represents how many drinks will be available VenMachine has drinks. VenMachine
   * is "Aggregation" relationship.
   */
  public Coffee coffee[];

  public Tea tea[];

  /** In this example we have 3 types of drinks for each tea and coffee. */
  public VendMachine() {
    coffee = new Coffee[3];
    coffee[0] = new Espresso();
    coffee[1] = new Americano();
    coffee[2] = new LatteMacchiato();
    tea = new Tea[3];
    tea[0] = new BlackTea();
    tea[1] = new GreenTea();
    tea[2] = new YellowTea();
  }
}
