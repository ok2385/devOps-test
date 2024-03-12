package Day2.Chapter2;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("내용을 입력하세요 : ");
    // int num = in.nextInt();
    // float num = in.nextFloat();
    String num = in.nextLine();
    double d1 = Double.parseDouble(num);
    double result = 1 + d1;
    System.out.printf("당신이 입력한 내용은 %s 입니다\n",num);
    System.out.printf("당신이 입력한 숫자에 1을 더하면 %.2f 입니다",result);
  }
}
