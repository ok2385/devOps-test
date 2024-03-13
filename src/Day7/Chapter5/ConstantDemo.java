package Day7.Chapter5;

public class ConstantDemo {
  public static void main(String[] args) {
    final int male = 0;
    final int female = 1;
    final int east = 0;
    final int west = 1;
    int gender = female;
    int direction = east;
    if (gender == male){
      System.out.println(gender + "은 병역 의무가 있다");
    }else {
      System.out.println(gender + "은 병역 의무가 없다");
    }
    if (gender != west){
      System.out.println(gender + "은 병역 의무가 있다");
    }else {
      System.out.println(gender + "은 병역 의무가 없다");
    }

    if (direction == east){
      System.out.println(direction + "방향에서 해가 뜹니다");
    }else {
      System.out.println(direction + "방향에서 해가 뜹니다");
    }
  }
}
