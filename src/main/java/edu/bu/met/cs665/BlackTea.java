package edu.bu.met.cs665;

public class BlackTea extends Tea {

  /** class BlackTea inherits Tea class. */
  public BlackTea() {
    super();
    this.setName("Black Tea"); // we name it as 'Black Tea'
    this.setPrice(2.25); // set a price
  }

  /** we override brew methods from Tea class, now it brews Black Tea. */
  @Override
  public void brew() {
    super.brew();
    System.out.println("Black tea is made");
    // this represents something like adding tea bags
  }
}
