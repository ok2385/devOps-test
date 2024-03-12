package Day5.Chapter5;

import java.util.ArrayList;

public class ArrayListDemo3 {
  public static void main(String[] args) {
    ArrayList<String> sArrayList = new ArrayList<>();
    sArrayList.add("A");
    System.out.println(sArrayList.toArray().length);
    sArrayList.add("B");
    System.out.println(sArrayList.toArray().length);
    sArrayList.add("C");
    System.out.println(sArrayList.toArray().length);
    sArrayList.add("D");
    System.out.println(sArrayList.toArray().length);

    System.out.println(sArrayList);
    System.out.println("3번째 원소의 값은 "+ sArrayList.get(2));
  }
}
