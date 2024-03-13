package Day7.Chapter5;

public class Ex3 {
  public static void main(String[] args) {
    sum(1,2,3,4);
    int arr[] = {2,3};
    sum(1,arr);
    sum(1,2,3,4,5);
  }

  public static void sum(int num,int...v){
    int sum = 0;
    for (int i = 0; i < v.length; i++) {
      sum+=i;
    }
    System.out.println(sum);
  }

}
