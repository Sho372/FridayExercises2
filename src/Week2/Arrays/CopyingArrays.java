package Week2.Arrays;

import java.util.Random;

public class CopyingArrays {

  public static void main(String[] args) {
    int[] arr = new int[10];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
    int[] arr2 = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr2[i] = arr[i];
    }
    arr[9] = -7;
    System.out.print("Array 1: ");
    displayArr(arr);
    System.out.println();
    System.out.print("Array 2: ");
    displayArr(arr2);
  }

  static void displayArr(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
