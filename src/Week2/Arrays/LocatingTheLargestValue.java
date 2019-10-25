package Week2.Arrays;

import java.util.Random;

public class LocatingTheLargestValue {
  public static void main(String[] args) {
    int[] arr = new int[10];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
    System.out.print("Array: ");
    displayArr(arr);
    System.out.println("");
    System.out.println("");
    searchMaxWithIndex(arr);
  }

  static void displayArr(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void searchMaxWithIndex(int[] arr) {
    int max = arr[0];
    int maxIndex = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (max < arr[i + 1]) {
        max = arr[i + 1];
        maxIndex = i + 1;
      }
    }
    System.out.println("The largest value is " + max);
    System.out.println("It is in slot " + maxIndex);
  }
}
