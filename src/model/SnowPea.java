package model;

public class SnowPea extends Vegetable {

  public SnowPea() {
    super("SnowPea", VegType.SEED);
    setInstructions("Add manure to the soil. Mulch well. Water sparsely unless the plants are wilting.");
  }

  // EFFECTS: Prints out feeding instructions
  @Override
  public void feed() {
    System.out.println("Make sure that you have well-drained, humus-rich soil.");
  }

  // EFFECTS: Prints out watering instructions
  @Override
  public void water() {
    System.out.println("Water sparsely unless the plants are wilting. Do not let plants dry out, or no pods will be produced.");
  }

  // EFFECTS: Prints out harvesting instructions
  @Override
  public void harvest() {
    System.out.println("Always use two hands when you pick peas. Secure the vine with one hand and pull the peas off with your other hand.");
  }
}
