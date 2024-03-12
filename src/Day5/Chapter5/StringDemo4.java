package Day5.Chapter5;

public class StringDemo4 {
  public static void main(String[] args) {
    String s1 = "abc";

    System.out.println(String.format("%s%d", "jdk", 17));

    System.out.println(String.join(": ", "A", "B", "C"));

    System.out.println(String.valueOf(10) + 10);
    System.out.println(String.valueOf(3.14) + 3.14);
    System.out.println(String.valueOf('c') + 10);

    String html1 = """
        <html>
          <body>
          </body>
        </html>
        """;
    System.out.println(html1);

  }
}
