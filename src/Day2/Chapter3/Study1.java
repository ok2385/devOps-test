package Day2.Chapter3;

public class Study1 {
  public static void main(String[] args) {
//    int row = 1;
//    while (row<10){
//      int column = 1;
//      while(column<10){
//        System.out.printf("%4d",row*column);
//        column++;
//      }
//      System.out.println();
//      row++;
//    }
    String blank = "";
    for(int row = 1; row < 10; row++){
      for(int column = 1; column < 10; column++){
        if(row >=column &&  column <= 5 || row > 5){
          System.out.printf("%4d",row*column);
        } else{
          System.out.printf("%4s",blank);
        }
      }
      System.out.println();
    }
  }
}
