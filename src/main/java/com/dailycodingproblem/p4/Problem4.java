package com.dailycodingproblem.p4;

import java.util.List;
import java.util.Objects;

/**
 * Given an array of integers, find the first missing positive integer in linear time and constant
 * space. In other words, find the lowest positive integer that does not exist in the array. The
 * array can contain duplicates and negative numbers as well. You can modify the input array
 * in-place.
 */

class Problem4 {

  /*
  Time Complexity - O(n)
  Space Complexity - O(1)
  Auxiliary Space - O(1)
   */
  static int findMissingPositiveIntegerSolution(List<Integer> input) {
    Objects.requireNonNull(input,
        "input should not be null at Problem4.findMissingPositiveIntegerSolution");

    int sizeOfArray = input.size();
    int i = 0;
    for (int j = 0; j < sizeOfArray; j++) {
      if (input.get(j) == 0) {
        input.set(j, -1); /*Going to use 0 as a placeholder for found the j+1th element.
                            So have to clean up the array*/
      }
    }

    while (i < sizeOfArray) {
      int currentLocation = i + 1;
      int currentValue = input.get(i); //Using the Array indexes as a placeholder
      int destinationLocation = currentValue - 1;
      if (currentValue == currentLocation) { // Move on if you found the ith Integer
        i++;
      } else if (currentValue <= 0 //Anything marked as zero
          || currentValue > sizeOfArray
          //Anything bigger than the array itself.Pigeon Hole Principle
          || currentValue == input.get(destinationLocation)) { // Handling duplicates
        input.set(i, 0); //Mark this element as found
        i++;
      } else {
        //Swap
        input.set(i, input.get(destinationLocation));
        input.set(destinationLocation, currentValue);
      }
    }

    //Find the element that has been marked as not found.
    // If all elements were found then the missing element is ( size of array + 1 )
    int missingInteger = sizeOfArray + 1;
    for (int j = 0; j < sizeOfArray; j++) {
      if (input.get(j) == 0) {
        missingInteger = j + 1;
        break;
      }
    }

    return missingInteger;

  }

}
