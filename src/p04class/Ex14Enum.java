package p04class;

    class Direction {
  static final int NORTH = 0;
  static final int EAST = 1;
  static final int SOUTH = 2;
  static final int WEST = 3; // 멤버변수
  private Direction(){}
}
public class Ex14Enum {
  public static void main(String[] args) {
    // 생성자 앞에 private 때문에 인스턴스 생성 불가
    //    Direction direction = new Direction();
    //    System.out.println(direction.EAST);

    System.out.println(Direction.EAST); // 바로 불러오기

    // enum 클래스는 인스턴스 생성불가
    // Direct direct = new Direct();
    System.out.println(Direct.NORTH);
    System.out.println(Direct.EAST.name());
    System.out.println(Direct.EAST.ordinal());
    System.out.println(Direct2.WEST.name());
    System.out.println(Direct2.WEST.ordinal());
    System.out.println(Direct2.WEST.getValue());
  }
}



enum  Direct {
  NORTH, EAST, SOUTH, WEST // 0,1,2,3
}

enum Direct2 {
  NORTH(10), EAST(20), SOUTH(30), WEST(40);
  private final int value;
  Direct2(int value) {
    this.value = value;
  }
  public int getValue() {
    return value;
  }
}
enum Direct3 {
  NORTH(10, "^"), EAST(20, ">"), SOUTH(30, "v"), WEST(40, "<");
  private final int value;
  private final String symbol;
  Direct3(int value, String symbol) {
    this.value = value;
    this.symbol = symbol;
  }
  public int getValue() {
    return value;
  }
  public String getSymbol() {
    return symbol;
  }
}