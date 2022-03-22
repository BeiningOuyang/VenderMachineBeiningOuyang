package edu.bu.met.cs665;

public class Espresso extends Coffee {

  /** class Espresso inherits Coffee class. */
  public Espresso() {
    super();
    this.setName("Espresso"); // we name it as 'Espresso'
    this.setPrice(3.25); // we set price as 3.25
  }

  /** we override brew methods from Coffee class, now it brews Espresso. */
  @Override
  public void brew() {
    super.brew();
    System.out.println("Espresso is made");
    // this represents adding espresso shot to cup
  }
}
