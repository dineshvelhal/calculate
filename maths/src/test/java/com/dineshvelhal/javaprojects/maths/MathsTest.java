package com.dineshvelhal.javaprojects.maths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MathsTest {

  @Test
  public void testAdd() {
    assertEquals(4, (new Maths()).add(2, 2));
    assertEquals(2, (new Maths()).add(0, 2));
    assertEquals(5, (new Maths()).add(3, 2));
    assertEquals(3, (new Maths()).add(1, 2));
  }

  @Test
  public void testSubtract() {
    assertEquals(0, (new Maths()).subtract(1, 1));
    assertEquals(-1, (new Maths()).subtract(0, 1));
    assertEquals(2, (new Maths()).subtract(3, 1));
    assertEquals(-2, (new Maths()).subtract(-1, 1));
  }

  @Test
  public void testMultiply() {
    assertEquals(1, (new Maths()).multiply(1, 1));
    assertEquals(0, (new Maths()).multiply(0, 1));
    assertEquals(3, (new Maths()).multiply(3, 1));
    assertEquals(-1, (new Maths()).multiply(-1, 1));
  }

  @Test
  public void testDivide() {
    assertEquals(1, (new Maths()).divide(1, 1));
    assertEquals(0, (new Maths()).divide(0, 1));
    assertEquals(3, (new Maths()).divide(3, 1));
    assertEquals(-1, (new Maths()).divide(-1, 1));
    assertThrows(ArithmeticException.class, () -> (new Maths()).divide(1, 0));
  }
}

