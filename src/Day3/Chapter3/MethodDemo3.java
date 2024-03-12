package Day3.Chapter3;

public class MethodDemo3 {
  public static void main(String[] args) {
    CheckScore(true);
    CheckScore(false);
    CheckScore(true);
  }

  private static void CheckScore(boolean score) {
    if(score){
      System.out.println("정상범위 점수입니다");
    }else {
      System.out.println("잘못된 점수입니다");
    }
  }
}
