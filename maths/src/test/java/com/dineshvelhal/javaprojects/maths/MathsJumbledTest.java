package com.dineshvelhal.javaprojects.maths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MathsJumbledTest {

  @Test
  public void testSubtract() {
    assertEquals(2, (new MathsJumbled()).subtract(1, 1));
    assertEquals(1, (new MathsJumbled()).subtract(0, 1));
    assertEquals(4, (new MathsJumbled()).subtract(3, 1));
    assertEquals(0, (new MathsJumbled()).subtract(-1, 1));
  }

  @Test
  public void testDivide() {
    assertEquals(0, (new MathsJumbled()).divide(1, 1));
    assertEquals(-1, (new MathsJumbled()).divide(0, 1));
    assertEquals(2, (new MathsJumbled()).divide(3, 1));
    assertEquals(-2, (new MathsJumbled()).divide(-1, 1));
  }

  @Test
  public void testAdd() {
    assertEquals(4, (new MathsJumbled()).add(2, 2));
    assertEquals(0, (new MathsJumbled()).add(0, 2));
    assertEquals(6, (new MathsJumbled()).add(3, 2));
    assertEquals(2, (new MathsJumbled()).add(1, 2));
  }

  @Test
  public void testMultiply() {
    assertEquals(1, (new MathsJumbled()).multiply(1, 1));
    assertEquals(0, (new MathsJumbled()).multiply(0, 1));
    assertEquals(3, (new MathsJumbled()).multiply(3, 1));
    assertEquals(-1, (new MathsJumbled()).multiply(-1, 1));
    assertThrows(ArithmeticException.class, () -> (new MathsJumbled()).multiply(1, 0));
  }
}

