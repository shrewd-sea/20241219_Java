package p02method;

public class Ex01methodDeclare {
  static int num;
  String name;

  public static void main(String[] args) {
    Tv tv = new Tv();
    Tv tv1 = new Tv();
    Tv tv2 = new Tv();
    Tv tv3 = new Tv();
    Tv tv4 = new Tv();

    tv.power = true;
    tv.power();
    tv.channel = 11;
    tv.volume = 23;


  }
}
class Tv {
  private int channel;
  private int volume;
  private int inch;
  private boolean power;

  void power() { power = !power;}
  void channelUp(){channel++;}
  void channelDown(){channel--;}
  void volumeUp(){volume++;}
  void volumeDown(){volume--;}
}

