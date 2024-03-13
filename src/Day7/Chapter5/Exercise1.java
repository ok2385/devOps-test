package Day7.Chapter5;

public class Exercise1 {
  public static void main(String[] args) {
    // 1. 월~일요일까지의 상수값을 가지는 enum class를 생성하라

    // 2. 요일을 가리키는 변수를 선언하고 수요일로 초기화하라
    Weekend weekend = Weekend.wendsday;

    // 3. 2의 변수를 이용해 오늘이 무슨 요일인지 출력하는 프로그램을 완성하라
    if (weekend == Weekend.sunday || weekend == Weekend.saturday){
      System.out.println(weekend + "는 휴일 입니다");
    }else {
      System.out.println(weekend + "는 휴일이 아닙니다");
    }

  }
}
