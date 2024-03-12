package Day4.Exercise;

import java.util.Scanner;

public class AccountDemo1 {
  public static void main(String[] args) {
    Account account = accountCreate();
    accountManage(account);
  }

  private static Account accountCreate() {
    Scanner in = new Scanner(System.in);
    System.out.print("성함을 입력하세요 : ");
    String name = in.nextLine();
    System.out.println("계좌번호와 비밀번호를 입력하세요");
    System.out.print("계좌번호 : ");
    String aCNum = in.nextLine();
    System.out.print("비밀번호 : ");
    String pw = in.nextLine();
    return new Account(name, aCNum, pw, 0);
  }

  private static void accountManage(Account account) {
    Scanner in = new Scanner(System.in);
    System.out.println("계좌번호와 비밀번호를 입력하세요");
    System.out.print("계좌번호 : ");
    String aCNum = in.nextLine();
    System.out.print("비밀번호 : ");
    String pw = in.nextLine();
    if (account.getaCNum().equals(aCNum) && account.getPw().equals(pw)) {
      System.out.println("1. 입금 2. 출금 3. 잔고확인 4. 종료");
      int menu = in.nextInt();
      if (menu == 1) {
        System.out.print("입금할 금액 : ");
        long amount = in.nextLong();
        account.input(amount);
        account.checkMoney();
      } else if (menu == 2) {
        System.out.print("출금할 금액 : ");
        long amount = in.nextLong();
        account.output(amount);
        account.checkMoney();
      } else if (menu == 3) {
        account.checkMoney();
      } else {
        System.out.println("종료합니다");
      }
    } else {
      System.out.println("비밀번호 오류");
    }
  }
}
