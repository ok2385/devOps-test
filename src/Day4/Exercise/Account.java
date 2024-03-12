package Day4.Exercise;

public class Account {
  private String name;
  private String aCNum; // 숫자 5자리
  private String pw; // 숫자 4자리
  private long money;

  public long getLeft() {
    return money;
  }

  public String getName() {
    return name;
  }

  public String getPw() {
    return pw;
  }

  public String getaCNum() {
    return aCNum;
  }

  void input(long amount){
    money += amount;
  }
  void output(long amount){
    if (amount>money){
      System.out.println("출금오류");
    }else {
      money -= amount;
    }
  }
  public long getMoney(){
    return money;
  }
  void checkMoney(){
    System.out.printf("현재 남은 잔고는 %d 입니다\n",getMoney());
  }

  public Account(String name, String aCNum, String pw, long money) {
    this.name = name;
    this.aCNum = aCNum;
    this.pw = pw;
    this.money = money;
  }
}
