package p05trycatch;

public class Ex01trycatch {
  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    try {
      System.out.println(10 / 0);
      System.out.println(4);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println(5); // 예외가 발생하지 않으면 이부분은 출력되지않음, 예외 발생시 출력
    } finally {
      System.out.println(6);
      System.out.println(7); // try 영역 실행 후 무조건 실행
    }
  }
}
