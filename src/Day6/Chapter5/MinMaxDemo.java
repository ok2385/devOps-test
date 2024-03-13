package Day6.Chapter5;

import java.util.Arrays;

public class MinMaxDemo {
  public static void main(String[] args) {
    float[] farr = {1.0f, 10.2f, 5.6f, 4.8f, 4.7f};
    float max = farr[0];
    float min = farr[0];
    for (float v : farr) {
      if (v>max){
        max = v;
      }else if (v<min){
        min = v;
      }
    }
    System.out.println("최댓값 :" + max);
    System.out.println("최솟값 :" + min);

    // 배열을 Arrays.sort()을 이용하여 오름차순으로 변환하는 방법
    // 맨앞을 최솟값, 맨뒤가 최댓값

    Arrays.sort(farr);
    min = farr[0];
    max = farr[farr.length-1];
    System.out.println("최댓값 :" + max);
    System.out.println("최솟값 :" + min);

  }
}
