package p02method;

public class Ex01methodDeclare {
  static int num;
  String name;

  public static void main(String[] args) {
    Tv tv = new Tv();


    tv.power();
    tv.channelUp();
//    tv.channel = 38;
    tv.setChannel(38);
//    tv.channel = -100;
    tv.setChannel(-100); // 속성을 온전하 개념으로 보완


    Calculator cal = new Calculator();
    System.out.println(cal.add(3,2));
    System.out.println(cal.add(true,false));
    System.out.println(cal.add("hello","world")); //클래스가 같아도 매개변수가 다르면 사용가능 : 오버로딩
    System.out.println(cal.subtract(3,2));
    System.out.println(cal.multiply(3,2));
    System.out.println(cal.divide(3,2));
    System.out.println(true);
    System.out.println("hello");
  }
}

class Tv {
  private int channel; // 은닉성 : class의 속성을 온전한 개념으로 가져가기 위한 방책
  private int volume;
  private int inch;
  private boolean power;

  boolean getPower(){
    return power;
  }
  // 1. 메서드의 형태 :: return 없으면
  void power() {
    power = !power;
    System.out.println(power ? "전원이 켜졌습니다." : "전원이 꺼졌습니다.");
  }

  void channelUp() {
    channel++;
    System.out.println(channel + "번 채널입니다.");
  }

  void channelDown() {
    channel--;
    System.out.println(channel + "번 채널입니다.");
  }

  // 2. 메서드의 형태 :: 매개변수가 있는 경우
  void setChannel(int channel) {
    if (channel > 0) this.channel = channel;
  }

  void volumeUp() {
    volume++;
    System.out.println(volume + "크기입니다.");
  }

  void volumeDown() {
    volume--;
    System.out.println(volume + "크기입니다.");
  }
}


class Calculator {
  // 3. 메서드 형태 :: return이 있으면
  int add(int n1, int n2) {
    return n1 + n2;
  }
  boolean add(boolean n1, boolean n2) {
    return n1 || n2;
  }
  String add(String n1, String n2) {
    return n1 + n2;
  }
  int subtract(int n1, int n2) {
    return n1 - n2;
  }

  int multiply(int n1, int n2) {
    return n1 * n2;
  }
// 메서드의 리턴 타입과 실제 return 값의 타입이 일치
//  double divide(int n1, int n2) {
//    return n1 / (double)n2;
//  }
  int divide(int n1, int n2) {
    return (int)(n1 / (double)n2);
  }
}
