package p04class;

public class Ex01classUse {
  public static void main(String[] args) {
    // 클래스를 설계할 경우 공통된 속성을 어떤 식으로 전개하느냐
    // 1. has-A 관계 :: 포함 관계
    // 2. is-A 관계 :: 상속 관계

    // has-A 관계 :: 자동차는 엔진이다(x) / 엔진은 자동차다(x)
    Car car = new Car();
    System.out.println(car);
    car.engine = new Engine();
    System.out.println(car.engine.gitong);

    // is-A 관계 :: 소나무는 나무다.(o) / 나무는 소나무다(x)
    Tree tree = new Tree();
    PineTree pinetree = new PineTree();
    // 상속관계일 경우 클래스의 형변환이 이루어짐
    Tree tree2 = new PineTree();
  }
}
  class Car{
  Engine engine; // 클래스 안의 클래스 변수
      int price;
      String model;

      @Override
      public String toString() {
        return model + "/" + price + "/" + engine;
      }
  }
  class Engine {
    int gitong;
    String model;
  }

  class Tree { }
  class PineTree extends Tree {}


