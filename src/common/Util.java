package common;

public class Util {
  public static void typeof(Object obj) {
    System.out.println(obj.getClass().getSimpleName());

  }

  public static int rand(int seed) {
    return (int) (Math.random()* seed); }

}

