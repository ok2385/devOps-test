package Day5.Chapter5;

public class ArrayDemo {
  public static void main(String[] args) {
//    int[] score = new int[5];
//    for (int i = 0; i < 5; i++) {
//      score[i] = 100;
//      System.out.println(score[i]);
//    }
    int[] scores = {100,90,80,70,60};
    int[] scores1 = new int[]{100,90,80,70,60};
    int[] scores2;
    scores2 = new int[]{100,90,80,70,60};

    System.out.println("3번째 학생의 점수는 "+ scores[2]);

    scores[2] = 85;
    System.out.println("3번째 학생의 점수는 "+ scores[2]+"점 입니다");
    System.out.println(scores.length);
  }
}
