package Day4.Chapter4;

public class Car {

  private String model;
  int move;
  String direction;

  String getModel(){
    return model;
  }
  void setModel(String model){
    this.model = model;
  }
  void detect() {
    if (move > 0) {
      direction = "전진";
    } else if(move <0){
      direction = "후진";
    }else {
      direction = "정지";
    }
  }
  void show(){
    detect();
    System.out.printf("이 차의 모델은 %s이며, 입력받은 속도가 %d이므로 %s합니다\n",model,move,direction);
  }
  Car(int move,String model){
    this.move = move;
    this.model = model;
  }
}
