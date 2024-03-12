package Day3.Chapter3;

public class Ex2 {
  public static void main(String[] args) {
    long res1 = plus(10,30);
    System.out.println(res1);
    long res2 = minus(20,10);
    System.out.println(res2);
    long res3 = multiple(10,20);
    System.out.println(res3);
    double res4 = divide(10,0);
    System.out.println(res4);
  }
  public static long plus(int num1, int num2){
    return num1 + num2;
  }
  public static long minus(int num1, int num2){
    return num1 - num2;
  }
  public static double divide(long num1, long num2) {
    if (num2 > 0) {
      return (double)num1 / num2;
    }
    return 0;
  }
  public static double divide(double num1, double num2) {
    if (num2 > 0) {
      return (double)num1 / num2;
    }
    return 0;
  }
  public static double divide(int num1, int num2) {
    if (num2 > 0) {
      return (double)num1 / num2;
    }
    return 0;
  }
  public static long multiple(int num1, int num2){
    return (long) num1 * num2;
  }
}
