package edu.bu.met.cs665;

// Drink is a abstract class, Tea and Coffee inherit Drink class.
public abstract class Drink {

  private String name;
  private double price;

  public Drink() {}

  /**
   * Getter method.
   *
   * @return the name of the drink.
   */
  public String getName() {
    System.out.println("The name of this drink is " + name);
    return name;
  }

  /**
   * Setter method.
   *
   * @param name the name of the drink we want to set.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * getter method.
   *
   * @return the price of the drink.
   */
  public double getPrice() {
    System.out.println("The price of this drink is " + price);
    return price;
  }

  /**
   * setter method.
   *
   * @param price the price of the drink we want to set.
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /** public abstract Drink brew(int num_milk, int num_sugar). */
  public abstract void brew();
  // brew the beverage, leave implementations to child class

}
