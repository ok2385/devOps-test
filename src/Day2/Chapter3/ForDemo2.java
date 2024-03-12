package Day2.Chapter3;

public class ForDemo2 {
  public static void main(String[] args) {
    double number;
    for (int i = 0; i < 10 ; i++) {
      number = Math.random();
      System.out.println(number);
      System.out.println(number * 7 );
      System.out.println((int)(number * 7));
    }
  }
}
