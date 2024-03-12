package Day2.Chapter3;

import java.util.Scanner;

public class MultiIfDemo {
  public static void main(String[] args) {
    // 1. 점수를 키보드를 통해 입력을 받는다.

    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력하세요");
    int num = in.nextInt();
    String grade = "";
    // 2. 점수를 학점으로 변환한다.(90~100 : A , 80~90: B , 79보다 작으면 C)

//    if(num >=90 && num <= 100){
//      grade = "A";
//    }else if(num >=80 && num <90){
//      grade = "B";
//    }else{
//      grade = "C";
//    }
    if(num <= 70){
      grade = "C";
    } else if (num <= 80) {
      grade = "B";
    }else
      grade = "A";
    System.out.printf("당신의 학점은 %s 입니다",grade);
  }
}
