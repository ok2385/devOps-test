package Day4.Exercise;

public class Member {
  // 현실세계의 회원을 Member class로 모델링할려고 한다
  // 회원의 데이터는 이름, 아이디, 패스워드, 나이가 있다
  // 이 데이터를 가지는 Member class를 선언하라
  String name;
  String Id;
  String Pw;
  int age;

  boolean login(String id, String pw){
    if(id.equals("hong") && pw.equals("1234")){
      //System.out.println("로그인 완료");
      return true;
    }
      //System.out.println("로그인 실패");
      return false;
  }

  boolean logout(String id){
    if (id.equals("hong")){
      //System.out.println("로그인 아웃");
      return true;
    }
      //System.out.println("로그아웃 실패");
      return false;
  }

  public Member(String name, String id) {
    this.name = name;
    Id = id;
  }
}
