package p04class;

public class Ex09FunctionalInterface람다 {
  public static void main(String[] args) {
    CustomClass customClass = new CustomClass();

    // 인터페이스에 클래스를 형변환하는데, 인터페이스를 익명클래스로 만든 후 형변환
    CustomInterface customInterface = new CustomInterface() {
      @Override
      public void interfaceMethod() {
        System.out.println("익명클래스의 메서드 재정의");
      }

      @Override
      public void interfaceMethod2() {
        System.out.println("익명클래스의 메서드 재정의2");
      }
    };
    MyFunctionalInterface my = new MyFunctionalInterface() {
      @Override
      public void myCall() {
        System.out.println("myCall");
      }
    };
    MyInterface myInterface = new MyInterface() {
      @Override
      public void doIt() {
        System.out.println("Just Do it!!!!!");
      }
    };
    // lambda 식으로 축약
    MyInterface myInterface2 = () -> {
      System.out.println("Just Do it!!!!!");
    };
    MyInterface myInterface3 = () -> {
      System.out.println("Just Do it!!!!!");
    };
      MySqrt mySqrt = new MySqrt() {
        @Override
        public int mySqrt(int a) {
          return a*a;
        }
      };
      mySqrt = (int a) -> {return a*a;};
      mySqrt = (a) -> {return a*a;};
      mySqrt = a -> {return a*a;};
      mySqrt = a -> a*a; // 본체에 실행문이 아닌 값만 있는 경우는 return이 생략

    MyMaX myMaX = new MyMaX() {
      @Override
      public int myMax(int a, int b) {
        return a>b?a:b;
      }
    };
    myMaX = (int a, int b) -> {return a>b?a:b;};
    myMaX = (int a, int b) -> a>b?a:b;
    myMaX = (a, b) -> a>b?a:b;
  }
}

// 인터페이스 안에 추상메서드가 오직 하나만 있는 경우 Functional Interface
@FunctionalInterface
interface MyFunctionalInterface {
  void myCall();

  default void myDefault() {
  } // default 메서드는 상관 없음

  static void myStatic() {
  } // static 메서드는 상관 없음
}

//@FunctionalInterface //추상 메서드가 2개 이상이라서 적용 안됨.
interface CustomInterface {
  void interfaceMethod();

  void interfaceMethod2();
}

class CustomClass implements CustomInterface {
  @Override
  public void interfaceMethod() {
    System.out.println("interfaceMethod");
  }

  @Override
  public void interfaceMethod2() {
    System.out.println("interfaceMethod2");
  }
}

@FunctionalInterface
interface MyInterface {
  void doIt();
}

@FunctionalInterface
interface MySqrt {
  int mySqrt(int a);
}

@FunctionalInterface
interface MyMaX {
  int myMax(int a , int b);
}