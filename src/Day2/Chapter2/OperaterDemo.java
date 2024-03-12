package Day2.Chapter2;

public class OperaterDemo {
  public static void main(String[] args) {
    // 1. 증감연산자 ++, --
    int i = 1;
    System.out.println(i);
    i += 1;
    System.out.println(i);
    i++;
    System.out.println(i);

    i = i-1;
    System.out.println(i);
    i -= 1;
    System.out.println(i);
    i--;
    System.out.println(i);


    // 2. 산술연산자 + - * / %(나머지를 구하는 연산)
    int j = 1%2;
    System.out.println(j);
    int k = 2%2;
    System.out.println(k);

    // 3. 비교연산
    boolean b = (j <= k);
    System.out.println(b);

    // 4. 논리연산
    // true And true ==> true
    // false And ~~~ ==> false
    boolean b1 = 1 > 0 && 2 < 1;
    System.out.println(b1);

    // true OR ~~~ ==> true
    // false OR false ==> false
    boolean b2 = 1 > 0 || 0 == 1;
    System.out.println(b2);

    // 5. 조건연산 (삼항연산)
    boolean b3 = (1 < 1) ? true : false;
    System.out.println(b3);
  }
}
