package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {

  public static void main(String[] args) {
    ArrayList<Integer> list = createRondomList(100, 10);
    System.out.println("ArrayList: " + list);
  }

  static ArrayList<Integer> createRondomList(int bound, int size) {
    Random random = new Random();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(random.nextInt(bound) + 1);
    }
    return list;
  }
}
