package Day4.Exercise;

public class Circle {
  // 정적 멤버 , static 멤버 = class 멤버
  static int noc;
  static final double PI = 3.14;

  // 인스턴스 멤버
  int radius;
  String color;

  // 정적 메소드
  static void howMany() {
    System.out.println(noc);
    //System.out.println(radius);

  }

  // 인스턴스 메소드
  double findAreas() {
    return PI * radius * radius;
  }

  // 생성자
  public Circle(int radius, String color) {
    this.radius = radius;
    this.color = color;
    System.out.printf("%s 색과 반지름이 %d 이고 넓이가 %f 원이 %d개 생성되었습니다\n", color, radius,findAreas(), ++noc);
  }
}
