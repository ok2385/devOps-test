package Day5.Chapter4;

public class SingleTone {
  // static 멤버(필드,메소드)
  private static SingleTone singleTone = new SingleTone();
  // 생성자
  private SingleTone(){

  }
  // 접근자
  public static SingleTone getSingleTone() {
    return singleTone;
  }
}
