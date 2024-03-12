package Day2.Chapter3;

public class Ex1 {
  public static void main(String[] args) {
    // 1부터 100까지의 정수중에서 짝수의 총합을 출력하시오

    int sum = 0;
    int num = 0;

//    for (int i = 0; i < 100; i++) {
//      num += 1;
//      if (num % 2 == 0) {
//        sum += num;
//      }
//    }
    int i =0;
    while (i<100){
      num+=1;
      i++;
      if(i%2==0){
        sum+=num;
      }
    }
    System.out.println(sum);
  }
}