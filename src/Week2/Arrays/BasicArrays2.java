package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {

  public static void main(String[] args) {
    int[] arr = new int[10];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Slot " + i + " contains a " + arr[i]);
    }
  }
}
