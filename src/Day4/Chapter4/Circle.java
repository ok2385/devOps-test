package Day4.Chapter4;

public class Circle {
  // 멤버 - 필드, 메소드
  private int radious;
  private String color;

  String getColor(){
    return color;
  }
  void setColor(String color){
    this.color = color;
  }
  int getRadious(){ //접근자
    return radious;
  }
  void setRadious(int radious){
    if(radious>0){
      this.radious = radious;
    }
  }
  double findArea(){
    return 3.14 * radious * radious;
  }

  void show(){
    System.out.printf("반지름의 크기는 %d이고 원의 넓이는 %.2f이며 색깔은 %s 입니다\n",radious,findArea(),color );
  }
  // 생성자
  Circle(int radious){
//    if(radious>0){
//      this.radious = radious;
//    }
//    this.color = "white";
    this(radious,"white");
  }
  Circle(String color){
//    this.radious = 1;
//    this.color = color;
    this(1,color);
  }

  Circle(int radious,String color){
    if (radious>0){
      this.radious = radious;
      this.color = color;
    }
  }
  Circle(){
    this(1,"white");
  }
}
