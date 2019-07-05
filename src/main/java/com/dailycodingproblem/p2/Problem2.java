package com.dailycodingproblem.p2;

import java.util.Objects;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array
 * is the product of all the numbers in the original array except the one at i. For example, if our
 * input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was
 * [3, 2, 1], the expected output would be [2, 3, 6]. Follow-up: what if you can't use division?
 */

class Problem2 {

  /*
  Time Complexity - O(n)
  Space Complexity - O(0)
  Auxiliary Space - O(1)
   */
  static int[] productArraySolutionByDivision(int[] input) {

    Objects.requireNonNull(input,
        "input cannot be null at Problem2.productArraySolutionByDivision");

    // Multiplies the input array elements to get the product.
    long product = 1;
    for (int i : input) {
      product *= i;
    }

    int asf;

    for (int i = 0; i < input.length; i++) {
      //Sets the input array elements to product/itself
      input[i] = (int) product / input[i];
    }
    return input;
  }

  /*
      Time Complexity - O(n)
      Space Complexity - O(n)
      Auxiliary Space - O(1)
   */
  static int[] productArraySolutionNotUsingDivision(int[] input) {

    Objects.requireNonNull(input,
        "input cannot be null at Problem2.productArraySolutionNotUsingDivision");

    // Create another array to hold the output.
    int[] output = new int[input.length];

    // Loop through input and populate output with values from the right
    output[0] = 1;
    for (int i = 1; i < input.length; i++) {
      output[i] = output[i - 1] * input[i - 1];
    }

    // Loop through input and populate output with values from the left
    int temp = 1;
    for (int i = input.length - 2; i >= 0; i--) {
      temp = temp * input[i + 1];
      output[i] = output[i] * temp;
    }

    return output;
  }


}
