package Day4.Chapter4;

public class CircleDemo {
  public static void main(String[] args) {
    Circle myCircle = new Circle(1);
    //myCircle.radious = 1;
    //myCircle.setRadious(1);
    myCircle.show();

    Circle yourCircle = new Circle("black");
    //yourCircle.radious = 10;
    //myCircle.setRadious(-3);
    yourCircle.show();

    Circle Circle3 = new Circle(10,"yellow");
    Circle3.show();
  }
}
