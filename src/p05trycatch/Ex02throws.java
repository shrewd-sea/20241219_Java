package p05trycatch;

public class Ex02throws {
  public static void main(String[] args) throws Exception {
    method1();
  }

  static void method1() throws Exception {
    method2();
  }
  static void method2() throws Exception {
    method3();
  }
  static void method3() throws Exception {
    try {
      throw new Exception();
    } catch (Exception e) {
      System.out.println("예외 처리");
      try {
        throw new RuntimeException();
      } catch (RuntimeException ex) {
        throw new RuntimeException(ex);
      }
    }
  }
}
