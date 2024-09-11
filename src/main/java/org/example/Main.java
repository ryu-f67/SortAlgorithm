package org.example;

import static org.example.BubbleSort.bubbleSort;
import static org.example.SelectionSort.selectionSort;

public class Main {

  public static void main(String[] args) {
    System.out.println("Bubble Sort");
    bubbleSort();

    System.out.println("Selection Sort");
    selectionSort();
  }
}