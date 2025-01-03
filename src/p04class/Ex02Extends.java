package p04class;

public class Ex02Extends {
  public static void main(String[] args) {
    Marine marine = new Marine();
    Marine marine2 = new Marine();
    System.out.println(marine);
    Marine marine3 = new Marine();
    Marine marine4 = new Marine();
    System.out.println(marine.armor);
    System.out.println(marine.hp);
    marine.move(); marine2.move(); marine3.move();
    marine4.pattrol();

    Zealot z1 = new Zealot();
    System.out.println(z1);

    Zergling z2 = new Zergling();
    System.out.println(z2);
  }
}
 class Unit {
  int hp; String tribe; String name;
   public Unit(String tribe, int hp, String name) {
     this.tribe = tribe;
     this.hp = hp;
     this.name = name;
   }

   void move() {
   }

   void stop() {
   }

   @Override
   public String toString() {
     return String.format("종족: %s, 이름: %s, hp: %d", tribe, name, hp);
   }
 }

class Terran extends Unit {
  public Terran(String tribe, int hp, String name) {
    super("테란", hp, name);
    // super()와 this()는 같이 사용 안됨.
    tribe = "테란"; super.hp = hp; super.name = name; // 위와 동일한 표현
  }
}
  class Marine extends Terran {
    public Marine() {
    super("테란",60, "마린");
    }
    int armor;
    void pattrol () {
    }
  }
class Zerg extends Unit {
  public Zerg(String tribe, int hp, String name) {
    super("저그", hp, name);
  }
}
class Zergling extends Protoss{
  public Zergling() {
    super ("저그", 40, "저글링");
  }
  void  attack() {
  }
}

class Protoss extends Unit {
      public Protoss(String tribe, int hp, String name) {
        super("프로토스", hp, name);
      }
}
class Zealot extends Protoss{
    public Zealot() {
      super ("프로토스", 200, "질럿");
    }
  void  attack() {
  }
}

class creature {}
