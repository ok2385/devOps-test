package Day3.Chapter3;

public class ParamDemo {
  public static void main(String[] args) {
    int n = 0;
    System.out.println("main(시작) :"+n);
    increment(n);
    System.out.println("main(종료) :"+n);
  }


  private static void increment(int m){
    System.out.println("메소드 내부(시작) :"+m);
    m++;
    System.out.println("메소드 내부(종료) :"+m);
  }
}
