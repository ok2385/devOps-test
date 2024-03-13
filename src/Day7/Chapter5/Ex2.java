package Day7.Chapter5;

public class Ex2 {
  public static void main(String[] args) {
    System.out.println(countChar("hello",'l'));
    System.out.println(countChar("hello",'L'));
    System.out.println(countChar("heLLo",'l'));
  }

  private static void nPrint(String args, int i1) {
    for (int i = 0; i < i1; i++) {
      System.out.println(args);
    }
  }
  static  int countChar(String s, char c) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.toUpperCase().charAt(i) == Character.toUpperCase(c)) {
        count++;
      }
    }
    return count;
  }
}
