package Day7.Chapter5;

public enum Weekend {
  monday("월요일"), tuesday("화요일"), wendsday("수요일"),
  thursday("목요일"), friday("금요일"), saturday("토요일"), sunday("일요일");

  private String w;

  Weekend(String w){
    this.w = w;
  }
  public String toString(){
    return w;
  }

}
