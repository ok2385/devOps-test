package Day7.Chapter5;

public class EnumDemo {
  public static void main(String[] args) {
    Gender gender = Gender.female;
    Gender gender1 = Gender.male;
    if (gender == Gender.male) {
      System.out.println(gender + "은 병역 의무가 있다");
    } else {
      System.out.println(gender + "은 병역 의무가 없다");
    }

    System.out.println(gender.name());
    System.out.println(gender.ordinal());
    System.out.println(gender1.ordinal());
    System.out.println(Gender.valueOf(gender.name()));
    System.out.println(Gender.valueOf(gender1.name()));
  }
}
