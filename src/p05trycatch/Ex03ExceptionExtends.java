package p05trycatch;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03ExceptionExtends {
  public static void main(String[] args) {
    Child child = new Child();
    child.method();

  }
}

class Parent {
  public void method() throws ClassCastException, ArithmeticException {}
}
class Child extends Parent {
  // 오버라이드시 주의 사항
  // 1. 접근 제어자는 같거나 넓어야 한다.
  // 2. 예외처리 throws는 exception 갯수와 적거나 같거나 없을 수 있다. 단, 추가 안됨
  @Override
  public void method() {
    super.method();
  }
}