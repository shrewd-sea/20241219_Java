package p06JavaPackage;

public class Ex01Object {
  public static void main(String[] args) {
    Object obj = new Object();
    System.out.println("obj: " + obj); // toString
    System.out.println("obj: " + obj.toString()); // toString
    System.out.println(System.identityHashCode(obj));
    MyObj myObj1 = new MyObj();
    System.out.println(myObj1);
    System.out.println(System.identityHashCode(myObj1));
    MyObj myObj2 = new MyObj();
    System.out.println(myObj2);
    System.out.println(System.identityHashCode(myObj2));
    System.out.println("myObj1 == myObj2 : " + (myObj1 == myObj2));
    System.out.println("myObj1.equals(myObj2) : " + (myObj1.equals(myObj2)));
    MyObj myObj3 = null;
    try {
      myObj3 = (MyObj) myObj1.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("myObj1 == myObj3 : " + (myObj1 == myObj3));
    System.out.println("myObj1.equals(myObj3) : " +(myObj1.equals(myObj3)));
  }
}

 class MyObj implements Cloneable {
  // getClass(), hashCode(), equals(Object obj), toString(), clone()
  // notify(), notifyAll(), wait(), finalize()
  int val = 100;

   @Override
   public String toString() {
     return "값은 " + val;
   }

   @Override
   public boolean equals(Object obj) {
     MyObj myObj = null;
     if(obj instanceof MyObj){
       myObj = (MyObj) obj;
   }
   return myObj.val == this.val;
 }

 // clone()을 사용하기 위해 hashCode(), clone()을 재정의.
//   @Override
//   public int hashCode() {
//     return Object.hash(val);
//   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
     Object obj = null;
     try {
       obj = super.clone(); //MyObject => Object (자부)
     } catch (CloneNotSupportedException e) { }
     return obj;
   }
 }