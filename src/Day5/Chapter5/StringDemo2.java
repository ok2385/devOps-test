package Day5.Chapter5;

public class StringDemo2 {
  public static void main(String[] args) {
    String s1 = "hi, java";
    String s2 = "hi, java";
    String s3 = new String("hi ,java");
    String s4 = new String("hi, java");

    s1 = s3;

    String s5 = "java";
    String s6 = "JAVA";
    // equals
    System.out.println(s5.equals(s6));
    System.out.println(s5.equalsIgnoreCase(s6));
    // compareTO
    System.out.println(s6.compareTo(s5));
    System.out.println(s5.compareToIgnoreCase(s6));

  }
}
