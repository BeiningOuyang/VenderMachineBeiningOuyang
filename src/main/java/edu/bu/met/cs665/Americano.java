package edu.bu.met.cs665;

public class Americano extends Coffee {

  /** class Americano inherits Coffee class. */
  public Americano() {
    super();
    this.setName("Americano"); // we name it as 'Americano'
    this.setPrice(2.75); // we set price as 2.75
  }

  /** we override brew methods from Coffee class, now it brews Americano. */
  @Override
  public void brew() {
    super.brew();
    System.out.println("Americano is made");
  }
}
