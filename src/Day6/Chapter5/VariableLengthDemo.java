package Day6.Chapter5;

public class VariableLengthDemo {
  public static void main(String[] args) {
    sum(1,2,3,4,5,6,9);
  }

  public static void sum(int... v){
    int sum = 0;
    for (int i : v) {
      sum += i;
    }
    System.out.println(sum);
  }
}
