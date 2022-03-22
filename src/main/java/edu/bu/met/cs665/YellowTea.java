package edu.bu.met.cs665;

public class YellowTea extends Tea {

  /** class YellowTea inherits Tea class. */
  public YellowTea() {
    super();
    this.setName("Yellow Tea"); // we name it as 'Yellow Tea'
    this.setPrice(2.75); // set a price
  }

  /** we override brew methods from Tea class, now it brews Yellow Tea. */
  @Override
  public void brew() {
    super.brew();
    System.out.println("Yellow tea is made");
    // this represents something like adding tea bags
  }
}
