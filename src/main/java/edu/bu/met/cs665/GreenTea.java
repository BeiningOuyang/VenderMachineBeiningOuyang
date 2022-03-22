package edu.bu.met.cs665;

public class GreenTea extends Tea {

  /** class GreenTea inherits Tea class. */
  public GreenTea() {
    super();
    this.setName("Green Tea"); // we name it as 'Green Tea'
    this.setPrice(2.50); // set a price
  }

  /** we override brew methods from Tea class, now it brews green Tea. */
  @Override
  public void brew() {
    super.brew();
    System.out.println("Green tea is made");
    // this represents something like adding tea bags
  }
}
