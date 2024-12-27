package p01Variable;

public class Ex01VariableDeclare {
  static int num; // 전역변수
  String name;
  // 변수의 재선언이 안됨.
  // int num;

  // 변수 선언 후 초기화는 메서드 안에서 가능
  //  num =100;

  // 변수의 할당(선언과 초기화)시에는 동시에
  int sum = 0;


  public static void main(String[] args) {
    int tot = 10;
    num = 1000;
    Ex01VariableDeclare e = new Ex01VariableDeclare(); // new 생성 연산자
    e.name = "10";

// java 10부터 지역 변수에서만 var 사용
    var input = true;

    // 변수 선언시에는 왼쪽은 타입 변수명, 오른쪽은 값(실제값, 주소값)
    // 타입은 프로그램이 끝나기까지 해당 영역에서 사용된다. 다른 타입의 값이 할당불가
    boolean power = false;
  }
}
