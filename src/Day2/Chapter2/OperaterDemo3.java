package Day2.Chapter2;

/**
 *  0 으로 나누는 경우
 */
public class OperaterDemo3 {
  public static void main(String[] args) {
    // int result = 5/0; //오류 발생
    Double.isInfinite(5/0.0);
    System.out.println(Double.isInfinite(5/0.0));
    System.out.println(Double.isNaN(5%0.0));
  }
}
