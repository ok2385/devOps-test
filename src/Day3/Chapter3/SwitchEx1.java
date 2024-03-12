package Day3.Chapter3;

import java.util.Scanner;

public class SwitchEx1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String animals = in.nextLine();
    String name = "";
//    final int ONE = 1;
//    int result=1;
//    int num = 10;
//    switch(result){
//      case ONE :
//        System.out.println("1입니다");
//      case (int)10.0 :
// }
    switch(animals){
      case "호랑이", "사자" -> name = "포유류";
      case "참새", "독수리" -> name = "조류";
      default -> {
        System.out.print("어이쿠! ");
        name = "...";
      }
    }
    System.out.printf("%s는 %s 입니다\n",animals,name);
  }
}
