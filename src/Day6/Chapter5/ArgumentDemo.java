package Day6.Chapter5;

public class ArgumentDemo {
  public static void main(String[] args) {
    if (args.length == 2){
      int i1 = Integer.parseInt(args[1]);
      nPrint(args[0], i1);
    } else{
      System.out.println("매개변수의 숫자가 다릅니다");
    }
  }

  private static void nPrint(String args, int i1) {
    for (int i = 0; i < i1; i++) {
      System.out.println(args);
    }
  }
}
