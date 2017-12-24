package model;

public class Parsnip extends Vegetable {

  public Parsnip() {
    super("Parsnip", VegType.ROOT);
    setInstructions("Loosen the soil to a depth of 12-15 inches and mix in a 2- to 4-inch layer of compost. Sow 2 seeds per inch ½ an inch deep. Water during the summer if rainfall is less than 1 inch per week.");
  }

  // EFFECTS: Prints out feeding instructions
  @Override
  public void feed() {
    System.out.println("Loosen the soil to a depth of 12-15 inches and mix in a 2- to 4-inch layer of compost.");
  }

  // EFFECTS: Prints out watering instructions
  @Override
  public void water() {
    System.out.println("Water during the summer if rainfall is less than 1 inch per week.");
  }

  // EFFECTS: Prints out harvesting instructions
  @Override
  public void harvest() {
    System.out.println("Parsnips mature in about 16 weeks.");
  }
}
