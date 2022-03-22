package edu.bu.met.cs665;

public class LatteMacchiato extends Coffee {

  /** class LatteMacchiato inherits Coffee class. */
  public LatteMacchiato() {
    super();
    this.setName("Latte Macchiato"); // we name it as 'Latte Macchiato'
    this.setPrice(3.75); // we set price as 3.75
  }

  /** we override brew methods from Coffee class, now it brews Latte Macchiato. */
  @Override
  public void brew() {
    super.brew();
    System.out.println("Latte Macchiato is made");
  }
}
