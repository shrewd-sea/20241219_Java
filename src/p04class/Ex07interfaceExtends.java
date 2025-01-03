package p04class;

public class Ex07interfaceExtends implements ITriathlon {
  @Override
  public void play() {
    ITriathlon.super.play();
  }

  @Override
  public void swim() {
    System.out.println("수영");
  }

  @Override
  public void ride() {
    System.out.println("자전거");
  }

  @Override
  public void run() {
    System.out.println("계주");
  }

  public static void main(String[] args) {
    Ex07interfaceExtends player = new Ex07interfaceExtends();
    player.play();
  }
}

    interface ISwim {
      void swim();
    }
    interface IBicycle {
      void ride();
    }
    interface IMarathon {
      void run();
    }
    interface ITriathlon extends ISwim, IBicycle, IMarathon {
      public default void play() {
        swim();
        ride();
        run();
      }
    }