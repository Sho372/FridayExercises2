package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {

  public static void main(String[] args) {
    int[] arr = new int[10];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(50) + 1;
    }
    System.out.print("Array: ");
    displayArr(arr);
    System.out.println("");

    Scanner input = new Scanner(System.in);
    System.out.print("Value to find: ");
    int in = input.nextInt();
    search(in, arr);
  }

  static void displayArr(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void search(int target, int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (target == arr[i]) {
        System.out.println(target + " is in slot " + i + ".");
      }
    }
  }
}
