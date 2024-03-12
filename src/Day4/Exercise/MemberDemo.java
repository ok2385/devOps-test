package Day4.Exercise;

import java.util.Scanner;

public class MemberDemo {
  public static void main(String[] args) {
    // Member class를 이용해서 Member를 생생하고, 로그인 후 로그인에 성공하면 로그아웃 하는 프로그램
    Scanner in = new Scanner(System.in);
    System.out.print("아이디를 입력하세요 : ");
    String Id = in.nextLine();
    System.out.print("비밀번호를 입력하세요 : ");
    String Pw = in.nextLine();
    Member member = new Member("홍길동", "hong");
    if (member.login(Id, Pw)){
      System.out.println("로그인 완료");
    }else {
      System.out.println("로그인 실패");
    }

    if (member.logout(Id)){
      System.out.println("로그아웃");
    }else {
      System.out.println("로그아웃 실패");
    }
  }
}
