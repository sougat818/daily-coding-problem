package com.dailycodingproblem.p3;

import org.junit.Before;
import org.junit.Test;

public class Problem3Test {

  Problem3 problem3;

  @Before
  public void setUp() {
    problem3 = new Problem3();
  }

  @Test
  public void testSerialize() {
    problem3.serialize();
  }
}