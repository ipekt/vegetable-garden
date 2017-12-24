package test;

import model.Kale;
import model.VegType;
import model.Vegetable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VegetableTest {

  private Vegetable kale;

  @Before
  public void setUp() {
    kale = new Kale();
  }

  @Test
  public void testKale() {
    Assert.assertEquals(kale.getName(), "Kale");
    Assert.assertEquals(kale.getType(), VegType.LEAF);
    Assert.assertEquals(kale.getInstructions(), "Plant the seeds ¼ to ½ inch deep into well-drained, light soil.After about 2 weeks, thin the seedlings so that they are spaced 8 to 12 inches apart.");
  }
}
