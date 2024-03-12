package Day5.Chapter4;

public class SingleToneDemo {
  public static void main(String[] args) {
    SingleTone singleTone = SingleTone.getSingleTone();
    SingleTone singleTone1 = SingleTone.getSingleTone();

    System.out.println(singleTone);
    System.out.println(singleTone1);

  }
}
