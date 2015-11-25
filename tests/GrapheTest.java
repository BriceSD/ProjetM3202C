/*
 * GrapheTest.java
 * SAUNIER DEBES Brice
 * 25/11/15
 */

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

//@RunWith(HierarchicalContextRunner.class)
public class GrapheTest {
Graphe graphe;

  @org.junit.Before
  public void setUp() throws Exception {
    graphe = new Graphe(3);
  }

  @org.junit.After
  public void tearDown() throws Exception {
    graphe = null;
  }

  @Test
  public void constucter_whenInstatiate_shouldBeDefined() throws Exception {
    assertNotNull(graphe);
  }
}
