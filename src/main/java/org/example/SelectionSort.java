package org.example;

import java.util.Arrays;

public class SelectionSort {

  public static void selectionSort() {

    int[] numberList = {10, 55, 13, 2, 79, 16, 55, 88, 91, 3, 31};

    for (int i = 0; i < numberList.length; i++) {
      int minIndex = i;
      for (int j = i; j < numberList.length; j++) {
        if (numberList[j] < numberList[minIndex]) {
          minIndex = j;
        }
      }
      int temp = numberList[i];
      numberList[i] = numberList[minIndex];
      numberList[minIndex] = temp;

      System.out.println(Arrays.toString(numberList));
    }
    System.out.println(Arrays.toString(numberList));
  }
}
