package org.example;

import static org.example.BubbleSort.bubbleSort;
import static org.example.SelectionSort.selectionSort;

public class Main {

  public static void main(String[] args) {

    int[] numberList = {10, 55, 13, 2, 79, 16, 55, 88, 91, 3, 31};

    System.out.println("Bubble Sort");
    bubbleSort(numberList);

    System.out.println("Selection Sort");
    selectionSort(numberList);
  }
}