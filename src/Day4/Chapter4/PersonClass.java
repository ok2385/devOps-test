package Day4.Chapter4;

public class PersonClass {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public PersonClass setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public PersonClass setAge(int age) {
    this.age = age;
    return this;
  }

  public void sayHello(){
    System.out.printf("이름은 %s이고, 나이는 %d 입니다\n",name,age);
  }
}
