package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
  public static void main(String[] args) {
    ArrayList<Integer> list = createRondomList(50, 10);
    System.out.println("ArrayList: " + list);
    Scanner input = new Scanner(System.in);
    System.out.print("Value to find: ");
    int in = input.nextInt();
    System.out.println("");
    search(in, list);
  }

  static ArrayList<Integer> createRondomList(int bound, int size) {
    Random random = new Random();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(random.nextInt(bound) + 1);
    }
    return list;
  }

  static void search(int target, ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      if (target == list.get(i)) {
        System.out.println(target + " is in slot " + i + ".");
      }
    }
  }
}
