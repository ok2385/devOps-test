package Day5.Chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<String> arrayList = new ArrayList<>();
    String name;
    do {
      System.out.print("이름을 입력하세요(빈칸을 입력하면 종료) : ");
      name = in.nextLine();
        if (!name.isEmpty()){
          arrayList.add(name);
        }
//        if (name.equals(name)){
//          name = String.format("%s%d",name,++i);
//          System.out.println(arrayList);
//        }
    } while (!name.isEmpty());
    System.out.println(arrayList);
  }
}
