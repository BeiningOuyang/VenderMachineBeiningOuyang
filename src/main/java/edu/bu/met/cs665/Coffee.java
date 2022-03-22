package edu.bu.met.cs665;

/** Coffee inherits Drink class. */
public class Coffee extends Drink {

  private int sugarUnit = 0;
  private int milkUnit = 0;

  /** constructor method. */
  public Coffee() {
    this.setPrice(1.00);
  } // price of water and cup

  /** here we override the brew method of Drink to make coffee. */
  @Override
  public void brew() {
    System.out.println("Making your coffee");
    // this brew function represents process like:
    // add boil water to cup, preparing to make selected type of coffee, etc.
  }

  /**
   * add sugar method, maximum of 3 sugar is allowed.
   *
   * @return the number of sugar_unit added.
   */
  public int addSugar() {
    sugarUnit++;
    if (sugarUnit > 3) {
      System.out.println("Reach maximum:Not over 3 sugar please");
      sugarUnit = 3;
      return sugarUnit;
    }
    return sugarUnit;
  }

  /**
   * add milk method, maximum of 3 milk is allowed.
   *
   * @return the number of milk_unit added.
   */
  public int addMilk() {
    milkUnit++;
    if (milkUnit > 3) {
      System.out.println("Reach maximum:Not over 3 milk please");
      milkUnit = 3;
      return milkUnit;
    }
    return milkUnit;
  }

  /**
   * getter for milk condiments added.
   *
   * @return total milk units added.
   */
  public int getMilkUnit() {
    System.out.println("Total milk unit added is " + (milkUnit));
    return milkUnit;
  }

  /**
   * getter for sugar condiments added.
   *
   * @return total sugar units added.
   */
  public int getSugarUnit() {
    System.out.println("Total sugar units added is " + (sugarUnit));
    return sugarUnit;
  }

  /**
   * getter for all condiments added.
   *
   * @return total number of condiments added.
   */
  public int getTotalNumOfCondiments() {
    System.out.println("Total number of condiments added is " + (milkUnit + sugarUnit));
    return milkUnit + sugarUnit;
  }

  /**
   * getter for final price, coffee + condiments.
   *
   * @return The final price after adding condiments.
   */
  public double getFinalPrice() {
    // price of the base coffee and condiments
    double finalPrice = getMilkUnit() * 0.05 + getSugarUnit() * 0.05 + getPrice();
    // each milk increase 0.05, each sugar increase 0.05
    System.out.println("The final price after adding condiments is " + finalPrice);
    return finalPrice;
  }
}
