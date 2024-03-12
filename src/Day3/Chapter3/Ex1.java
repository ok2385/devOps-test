package Day3.Chapter3;

import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    // 1. 안내 메시지를 출력한다.

    // 2. 메뉴를 선택해서 입력한다.

    // 3. 입력된 메뉴에 따라 입금~, 출금~, 잔고~, 종료

    // 4. 1,2,3을 계속 반복한다. 종료메뉴가 선택되기 전까지
    extracted();
  }

  public static void extracted() {
    Scanner in = new Scanner(System.in);
    long account = 0l;
    String menu = "";
    do {
      System.out.println("----------------------------");
      System.out.println("1. 입금 2. 출금 3.잔고 4. 종료");
      System.out.println("----------------------------");
      String click = in.nextLine();
      switch (click) {
        case "입금":
          menu = "입금";
          System.out.print("입금하실 금액을 입력하세요 :");
          long money = in.nextLong();
          account = account + money;
          System.out.printf("현재 잔고는 %d 입니다", account);
          break;
        case "출금":
          menu = "출금";
          System.out.print("출금하실 금액을 입력하세요 :");
          money = in.nextLong();
          account = account - money;
          System.out.printf("현재 잔고는 %d 입니다", account);
          break;
        case "잔고":
          menu = "잔고";
          System.out.printf("현재 잔고는 %d 입니다", account);
          break;
        case "종료":
          menu = "종료";
          System.out.println("종료합니다");
          break;
      }
    } while (menu != "종료");
  }
}
