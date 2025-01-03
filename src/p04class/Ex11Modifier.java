package p04class;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex11Modifier {
  // public :: 같은 패키지 내에서나 다른 패키지에서도 참조 가능
  // protected :: 같은 패키지 내 혹은 다른 패키지에서는 상속 받을 경우 참조 가능
  // default :: 같은 패키지 내에서만 사용 가능
  // class :: 클래스 내에서만 사용 가능
  public int publicVar = 0;
  protected int protectedVar = 1;
  int defaultVar = 2;
  private int privateVar = 3;

  public void publicMethod(){
    System.out.println("publicMethod");
  }
  protected void protectedMethod(){
    System.out.println("protectedMethod");
  }
  void defaultMethod(){
    System.out.println("defaultMethod");
  }
  private void privateMethod(){
    System.out.println("privateMethod");
  }
  final void finalMethod(){}

  public static void main(String[] args) {
    // 익명클래스 혹은 람다식에서 참조하는 외부 지역변수는 final로 선언되거나
    // Effectively Final이어야 한다.
    int value = 10;
    JButton btn = new JButton("Click");
    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // value = 20;
        // 메서드 내의 지역변수가 메서드 내부의 익명클래스에서 사용할 때, 값이 변하지 않게 final을 붙여 사용
        int tmp = value; // 변경이 안되므로 다른 지역변수에 할당하여 사용
        tmp--;
      }
    });
  }
}
/*
* [ 제어자(Modifier) ]
* class  :: public, (default), final, abstract
* method :: All(public,protected,default,private), final, abstract, static
* 멤버변수 :: All, final, static
* 지역변수 :: final
*/

// class에 final을 붙이면 상속 불가
final class Human {}
//class  AI extends  Human {}

class Person {
  // 메서드에 final을 붙이면 override 불가
  final void finalMethod(){}
}
class Employee extends Person {
  //  @Override
//  void finalMethod(){System.out.println();}
}