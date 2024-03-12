package Day3.Chapter3;

import java.util.Scanner;

public class MultiIfDemo2 {
  public static void main(String[] args) {
    // 1. 점수를 키보드를 통해 입력을 받는다.
    // 1-1. 입력받은 점수가 유효한 범위내에 있는지 확인한다
    // 2. 점수를 학점으로 변환한다.(90~100 : A , 80~90: B , 79보다 작으면 C)
    //2-1. 유효하지 않으면 종료

    ScoreAndGrade();
  }

  private static void ScoreAndGrade() {
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력하세요");
    int num = in.nextInt();
    String grade = "";
    CheckScore(num);
    if(num >= 90){
      grade = "A";
    } else if (num <= 80) {
      grade = "B";
    }else
      grade = "C";
    System.out.printf("당신의 학점은 %s 입니다",grade);
  }

  private static void CheckScore(int score) {
    if(0<score && 100>=score ){
      System.out.println("정상범위 점수입니다");
    }else {
      System.out.println("잘못된 점수입니다");
    }
  }
}
