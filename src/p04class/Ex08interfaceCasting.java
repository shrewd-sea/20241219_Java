package p04class;

public class Ex08interfaceCasting {
  public static void main(String[] args) {
    // Polymorphism(다형성) = 상속 + interface

    // 상속 :: 수직적인 관계를 형변환
    Mammals[] mammalsArr = {new Elephant(), new Cat(), new Bat()};
    Birds[] birdsArr = {new Duck(), new Eagle(), new Owl()};
    for (int i = 0; i < mammalsArr.length; i++) {
      System.out.println(mammalsArr[i]); // 클래스에 정의된 모든 변수와 메서드 사용가능
    }
    
    // interface 형변환 :: 수평적인 관계를 형변환
    Groundable[] groundables = {new Elephant(), new Cat(), new Duck()};
    Flyable[] flyables = {new Bat(), new Eagle(), new Owl()};
    for (int i = 0; i < flyables.length; i++) {
      flyables[i].fly(); // 인터페이스에 정의된 메서드, 상수만 사용가능하지만
      // 메서드에서 클래스의 변수와 메서드에 접근 가능
    }
  }
}

interface Groundable{ void walk();}
interface Flyable{ void fly();}
class Mammals{}
class Birds{}
class Elephant extends Mammals implements Groundable {
  // interface의 추상메서드는 제어자가 public이라서 재정의할 경우 그보다 표현범위가 크거나 같아야 한다.
  public void walk(){
    System.out.println( name + "쿵쿵");
  }
    String name = "코끼리";
}
class Cat extends Mammals implements Groundable {
  @Override
  public void walk() {
    System.out.println( name + "냥뿐냥뿐");
  }
    String name = "고양이";
}
class Bat extends Mammals implements Flyable {
  @Override
  public void fly() {
    System.out.println( name + "파닥파닥");
  }
    String name = "박쥐";
}
class Duck extends Birds implements  Groundable {
  @Override
  public void walk() {
    System.out.println( name + "뒤뚱뒤뚱");
  }
    String name = "오리";
}
class Eagle extends Birds implements Flyable {
  @Override
  public void fly() {
    System.out.println( name + "펄럭펄럭");
  }
    String name = "독수리";
}
class Owl extends Birds implements  Flyable {
  @Override
  public void fly() {
    // 추상메서드를 implement한 클래스라서 메서드만 사용할 것 같지만
    // 실제로는 추상메서드에서 다른 메서드, 변수 등을 불러서 사용 가능.
    System.out.println( name + "부엉부엉");
  }
    String name = "부엉이";
}
