package org.example;

import java.util.Arrays;

public class QuickSort {

  public static void quickSort(int[] numberList, int startIndex, int endIndex) {

    if (startIndex >= endIndex) {
      return;
    }

    int partitionIndex = partition(numberList, startIndex, endIndex);
    quickSort(numberList, startIndex, partitionIndex-1);
    quickSort(numberList, partitionIndex+1, endIndex);

  }

  private static int partition(int[] numberList, int startIndex, int endIndex) {
    int i = startIndex - 1;
    int pivot = numberList[endIndex];

    for (int j = startIndex; j <= endIndex; j++) {
      if (numberList[j] < pivot) {
        i++;
        swap(numberList, i, j);
      }
    }
    i++;
    swap(numberList, i, endIndex);

    return i;
  }

  private static void swap(int[] numberList, int index1, int index2) {
    int temp = numberList[index1];
    numberList[index1] = numberList[index2];
    numberList[index2] = temp;
  }

}
