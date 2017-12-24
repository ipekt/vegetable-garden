package model;

public class Kale extends Vegetable {

  public Kale() {
    super("Kale", VegType.LEAF);
    setInstructions("Plant the seeds ¼ to ½ inch deep into well-drained, light soil.After about 2 weeks, thin the seedlings so that they are spaced 8 to 12 inches apart.");
  }

  // EFFECTS: Prints out feeding instructions
  @Override
  public void feed() {
    System.out.println("Mulch the soil heavily after the first hard freeze; the plants may continue to produce leaves throughout the winter.");
  }

  // EFFECTS: Prints out watering instructions
  @Override
  public void water() {
    System.out.println("Water the plants regularly, but be sure not to overwater them");
  }

  // EFFECTS: Prints out harvesting instructions
  @Override
  public void harvest() {
    System.out.println("Kale is ready to harvest when the leaves are about the size of your hand.");
  }
}
