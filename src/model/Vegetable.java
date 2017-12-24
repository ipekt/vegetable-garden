package model;

public abstract class Vegetable implements Growable {

  private String name;
  private VegType type;
  private String instructions;

  public Vegetable(String name, VegType type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VegType getType() {
    return type;
  }

  @Override
  public String getInstructions() {
    return instructions;
  }

  protected void setInstructions(String instructions) {
    this.instructions = instructions;
  }
}
