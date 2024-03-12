package Day5.Chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> arrayList = new ArrayList<>();
    int score;
    int sum = 0;

    do {
      System.out.print("점수를 입력하세요(0보다 작은 값을 입력하면 입력종료) : ");
      score = in.nextInt();
      if (score > 0) {
        arrayList.add(score);
      }
    } while (score > 0);

//    for (int i = 0; i < arrayList.size(); i++) {
//      sum += arrayList.get(i);
//    }
    for (Integer i : arrayList) {
      sum += i;
    }

    double avg = (double) sum / arrayList.size();
    System.out.printf("총합은 %d 평균은 %.2f", sum, avg);
  }
}
