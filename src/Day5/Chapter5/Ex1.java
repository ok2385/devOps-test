package Day5.Chapter5;

import java.util.Arrays;

public class Ex1 {
  public static void main(String[] args) {
    String[] strArr = {"A", "B", "C", "D", "E"};
    for (String s : strArr) {
      System.out.println(s);
    }

    System.out.println(Arrays.toString(strArr));


    // 문자열을 원소로 가지는 배열을 생성 = {"A", "B", "C", "D", "E"}
    // 참조변수 strArr 에 저장한다.
    // strArr 배열의 원소를 전부 출력하라. (1. foreach 2. Arrays의 메서드를 활용)

    // 숫자(float)를 가지는 배열 fArr를 생성 = {  }
    // fArr 배열의 원솔르 전부 출력

    float[] fArr = {1.2f, 2.5f, 3.0f};
    for (float f : fArr) {
      System.out.println(f);
    }

    System.out.println(Arrays.toString(fArr));
  }
}
