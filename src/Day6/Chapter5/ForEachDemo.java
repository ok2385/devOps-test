package Day6.Chapter5;

public class ForEachDemo {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int sum = 0;
    int sum1 = 0;
    for (int i : arr) {
      if (i % 2 == 0) {
        sum += i;
      } else {
        sum1 += i;
      }
    }
    System.out.println("짝수의 합은 : " + sum);
    System.out.println("홀수의 합은 : " + sum1);
  }
}
