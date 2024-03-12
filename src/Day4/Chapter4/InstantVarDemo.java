package Day4.Chapter4;

public class InstantVarDemo {
  public static void main(String[] args) {
    InstantVarClass.methodStatic();
    System.out.println(InstantVarClass.common);

    InstantVarClass i1 = new InstantVarClass();
    i1.instantVar++;
    i1.common++;
    System.out.println(i1.instantVar);

    InstantVarClass i2 = new InstantVarClass();
    i2.instantVar++;
    i2.common++;
    System.out.println(i2.instantVar);

    InstantVarClass i3 = new InstantVarClass();
    i3.instantVar++;
    i3.common++;
    System.out.println(i3.instantVar);
    System.out.println(InstantVarClass.common);
  }
}
