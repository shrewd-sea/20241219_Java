// class 밖으로 멤버변수와 메서드를 절대 선언할 수 없다.

import p04class.Ex11Modifier;

class Foo {
  String name;

  // 자동정렬 : ctrl alt l
  void sleep() {
    for (int i = 0; i < 2; i++) {
      System.out.println(name + " 쿨쿨~");
    } // main() 의 위치는 실행하고자 하는 파일에 하나만 존재
  }
}

// public 붙은 클래스는 반드시 파일명과 일치 , 단 하나의 class에만 붙일 수 있음
public class Main {
  public static void main(String[] args) {
    Foo foo = new Foo();
    foo.name = "곰돌이";
    foo.sleep();
    Ex11Modifier ex = new Ex11Modifier();
    ex.publicVar = 100;
    ex.publicMethod();
  }
}
class ExTemp extends Ex11Modifier {}