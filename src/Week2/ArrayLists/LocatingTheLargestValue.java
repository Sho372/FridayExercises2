package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LocatingTheLargestValue {
  public static void main(String[] args) {
    //
    ArrayList<Integer> list = createRondomList(100, 10);
    System.out.println("ArrayList: " + list);
    System.out.println("");
    searchMaxWithIndex(list);
  }

  static ArrayList<Integer> createRondomList(int bound, int size) {
    Random random = new Random();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(random.nextInt(bound) + 1);
    }
    return list;
  }

  static void searchMaxWithIndex(ArrayList<Integer> list) {
    int max = list.get(0);
    int maxIndex = 0;
    for (int i = 0; i < list.size() - 1; i++) {
      if (max < list.get(i + 1)) {
        max = list.get(i + 1);
        maxIndex = i + 1;
      }
    }
    System.out.println("The largest value is " + max + ", which is in slot " + maxIndex);
  }
}
