package org.example;

import java.util.Arrays;

public class BubbleSort {

  public static void bubbleSort() {

    int[] numberList = {10, 55, 13, 2, 79, 16, 55, 88, 91, 3, 31};

    for(int i = 0; i < numberList.length ; i++) {
      for(int j = 0; j < numberList.length-i-1; j++) {
        if(numberList[j] >= numberList[j+1]) {
          int temp = numberList[j];
          numberList[j] = numberList[j+1];
          numberList[j+1] = temp;
        }
      }
      System.out.println(Arrays.toString(numberList));
    }
    System.out.println(Arrays.toString(numberList));
  }
}
