package Day3.Chapter3;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    // 1. 점수를 키보드를 통해 입력을 받는다.

    Scanner in = new Scanner(System.in);
    System.out.println("100,90,80,70,60중에 점수를 입력하세요");
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
    if(num >=90){
      grade = "A";
    } else if (num >= 80) {
      grade = "B";
    }else if(num >= 70){
      grade = "C";
    }else{
      grade = "F";
    }
    System.out.printf("당신의 학점은 %s 입니다\n",grade);

    grade = ""; // 90, 80, 70, 60
    switch(num){
      case 100 :
        //grade = "A";
        //System.out.println("점수가 100점 입니다");
      case 90 :
        grade = "A";
        System.out.println("점수가 90점이거나 100점 입니다");
        break;
      case 80 :
        grade = "B";
        System.out.println("점수가 80점 입니다");
        break;
      case 70 :
        grade = "C";
        System.out.println("점수가 70점 입니다");
        break;
      default :
        grade = "F";
        System.out.println("점수가 60점 입니다");
    }
    System.out.printf("당신의 학점은 %s 입니다",grade);
  }
}
