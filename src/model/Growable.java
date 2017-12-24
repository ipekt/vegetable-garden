package model;

public interface Growable {

  // EFFECTS: Prints out feeding instructions
  void feed();

  // EFFECTS: Prints out watering instructions
  void water();

  // EFFECTS: Prints out harvesting instructions
  void harvest();

  String getInstructions();
}
