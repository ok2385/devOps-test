package Day6.Chapter5;

public class Ball {
  double radious;
  String color;

  public void print() {
    System.out.printf("반지름은 %.2f이고 색깔은 %s 입니다\n", radious, color);
  }

  public Ball(double radious, String color) {
    this.radious = radious;
    this.color = color;
  }
}
