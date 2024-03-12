package Day5.Chapter5;

public class StringDemo {
  public static void main(String[] args) {
    String s1 = "안녕, 자바";
    String s2 = "안녕, 자바";
    System.out.println(s1);
    System.out.println(s2);

    if(s1 == s2){
      System.out.println("동일한 객체입니다");
    }

    if (s1.equals(s2)){
      System.out.println("동일한 문자열입니다");
    }
  }
}
