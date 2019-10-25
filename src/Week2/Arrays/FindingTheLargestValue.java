package Week2.Arrays;

import java.util.Random;

public class FindingTheLargestValue {

  public static void main(String[] args) {
    int[] arr = new int[10];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
    System.out.print("Array: ");
    displayArr(arr);
    System.out.println("");
    searchMax(arr);
  }

  static void displayArr(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void searchMax(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      if (max < arr[i + 1]) {
        max = arr[i + 1];
      }
    }
    System.out.println("The largest value is " + max);
  }
}
