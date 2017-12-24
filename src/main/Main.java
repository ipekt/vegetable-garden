package main;

import java.util.ArrayList;
import java.util.List;
import model.Kale;
import model.Parsnip;
import model.SnowPea;
import model.Vegetable;

public class Main {
  public static void main(String[] args) {
    List<Vegetable> garden = new ArrayList<>();
    garden.add(new Parsnip());
    garden.add(new Kale());
    garden.add(new SnowPea());

    for (Vegetable vegetable : garden) {
      System.out.println("Name: " + vegetable.getName());
      System.out.println("Type: " + vegetable.getType());
      System.out.println("Instructions: " + vegetable.getInstructions());

      vegetable.feed();
      vegetable.water();
      vegetable.harvest();
    }
  }
}
