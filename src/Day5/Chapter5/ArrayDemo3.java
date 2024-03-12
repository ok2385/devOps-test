package Day5.Chapter5;

import java.util.Scanner;

public class ArrayDemo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] score = new int[5];
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      score[i] = in.nextInt();
    }
    for (int i = 0; i < score.length; i++) {
      sum += score[i];
    }
    System.out.println(sum);
    System.out.println((double) sum / score.length);

  }
}
