package Day5.Chapter5;

public class ArrayListDemo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    int sum =0;
    for (int i : arr) {
      sum+=i;
    }
    int[] newArr1 = new int[4];
    for (int i = 0; i < newArr1.length ; i++) {
      newArr1[i] = arr[i];
      System.out.println(arr.length);

    }
  }
}
