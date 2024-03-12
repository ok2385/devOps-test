package Day5.Chapter4;

public class StaticBlockDemo {
  static int sumOneToTen;
  static {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    sumOneToTen = sum;
  }


  public static void main(String[] args) {
    System.out.println(sumOneToTen);
  }
}
