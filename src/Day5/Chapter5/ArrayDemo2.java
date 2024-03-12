package Day5.Chapter5;

import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(arr);

    for (int i : arr) {
      System.out.println(i);
    }

    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        System.out.print(arr[i]);
      } else {
        System.out.print(arr[i] + ",");
      }
    }
    System.out.println("]");

    System.out.println(Arrays.toString(arr));

    char[] cArr = {'a', 'b', 'c'};
    for (char c : cArr) {
      System.out.println(c);
    }
    System.out.println(cArr);
    System.out.println(cArr[1] + "" + cArr[2]);
  }
}
