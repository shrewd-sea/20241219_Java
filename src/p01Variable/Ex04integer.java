package p01Variable;

import static common.Util.*;

public class Ex04integer {
  byte b1; // 8bit
  short s1; // 2byte
  int i1; // 4byte - 보통 많이 쓰임
  long l1; // 8byte

  public static void main(String[] args) {
    Ex04integer e4 = new Ex04integer();
    System.out.println(e4.b1);
    System.out.println(e4.s1);
    System.out.println(e4.i1);
    System.out.println(e4.l1);
    e4.l1 = 1_000_000_000_000_000L; // int보다 큰숫자뒤에는 L,l
    System.out.println(e4.l1);
    typeof(e4.l1);

    System.out.println(Byte.MIN_VALUE);
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Short.MIN_VALUE);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MIN_VALUE);
    System.out.println(Long.MAX_VALUE);

  }
}
