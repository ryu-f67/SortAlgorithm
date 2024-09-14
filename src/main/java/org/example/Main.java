package org.example;

import static org.example.BubbleSort.bubbleSort;
import static org.example.QuickSort.quickSort;
import static org.example.SelectionSort.selectionSort;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    System.out.println("Bubble Sort");
    int[] numList1 = {10, 55, 13, 2, 79, 16, 55, 88, 91, 3, 31};
    bubbleSort(numList1);

    System.out.println("Selection Sort");
    int[] numList2 = {10, 55, 13, 2, 79, 16, 55, 88, 91, 3, 31};
    selectionSort(numList2);

    System.out.println("Quick Sort");
    int[] numList3 = {10, 55, 13, 2, 79, 16, 55, 88, 91, 3, 31};
    quickSort(numList3, 0, numList3.length-1);
    System.out.println(Arrays.toString(numList3));
  }
}