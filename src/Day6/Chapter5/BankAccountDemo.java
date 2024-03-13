package Day6.Chapter5;

import java.util.ArrayList;
import java.util.Scanner;



public class BankAccountDemo {
  public static void main(String[] args) {
    ArrayList<Account> accounts = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int menu;
    String aCNum = "";
    long amount ;
    do {
      System.out.println("1. 계좌생성, 2. 입금 3. 출금 4. 잔고 5. 종료");
      menu = in.nextInt(); in.nextLine();
      if (menu == 1){
        accounts.add(accountCreate());
      } else if (menu == 2) {
        System.out.print("계좌번호를 입력하세요 : ");
        aCNum = in.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
          if (accounts.get(i).getaCNum().equals(aCNum)) {
            System.out.print("입금할 금액을 입력하세요 : ");
            amount = in.nextLong();
            accounts.get(i).input(amount);
          }
        }
      } else if (menu == 3) {
        System.out.print("계좌번호를 입력하세요 : ");
        aCNum = in.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
          if (accounts.get(i).getaCNum().equals(aCNum)){
            System.out.print("출금할 금액을 입력하세요 : ");
            amount = in.nextLong();
            accounts.get(i).output(amount);
          }
        }
      } else if (menu == 4) {
        System.out.print("계좌번호를 입력하세요 : ");
        aCNum = in.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
          if (accounts.get(i).getaCNum().equals(aCNum)){
            accounts.get(i).checkMoney();
          }
        }
      }
    }while (menu != 5);

    for (Account account : accounts) {
      System.out.printf("계좌번호 : %s,잔고 : %d\n",account.getaCNum(),account.getMoney());
    }
  }
  public static Account accountCreate() {
    Scanner in = new Scanner(System.in);
    System.out.println("계좌번호와 비밀번호를 입력하세요");
    System.out.print("계좌번호 : ");
    String aCNum = in.nextLine();
    System.out.print("비밀번호 : ");
    String pw = in.nextLine();
    return new Account(aCNum, pw, 0);
  }
}
