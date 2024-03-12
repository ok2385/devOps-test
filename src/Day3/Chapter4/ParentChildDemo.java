package Day3.Chapter4;

public class ParentChildDemo {
  public static void main(String[] args) {
    tiger t1 = new tiger();
    t1.eat();
    t1.move();
    t1.legs = 4;
    System.out.println(t1.legs+"개의 다리가 있습니다");

    bird b1 = new bird();
    b1.move();
    b1.legs = 2;
  }
}
