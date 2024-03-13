package Day7.Chapter5;

enum Gender {
  male("남성"), female("여성");

  private String s;
  Gender(String s){
    this.s=s;
  }

  public String toString(){
    return s;
  }
}
