package Day2.Chapter2;

import java.util.Scanner;

public class ScannerDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("정수 2개를 입력하세요");
    int i = in.nextInt();
    int i1 = in.nextInt();
    int result = i+i1;
    System.out.printf("i=%d and i1=%d i+i1=%d",i,i1,result);
  }
}
