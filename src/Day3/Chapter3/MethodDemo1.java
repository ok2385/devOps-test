package Day3.Chapter3;

public class MethodDemo1 {
  public static void main(String[] args) {
    sumAndPrint(11, 22);
    sumAndPrint(10, 100);
    sumAndPrint(100, 1000);
  }
//    int sum = 0;
//    for(int i = 10; i<=100; i++){
//      sum += i;
//    }
//    System.out.println("10~100까지의 합 : "+sum);

//    sum = 0;
//    for(int i = 100; i<=1000; i++){
//      sum += i;
//    }
//    System.out.println("100~1000까지의 합 : "+sum);
  public static void sumAndPrint(int num1, int num2){
    int sum = 0;
    for (int i = num1; i<=num2; i++){
      sum += i;
    }
    System.out.printf("%d~%d까지의 합 : %d\n",num1,num2,sum);
  }

}
