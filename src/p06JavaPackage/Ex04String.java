package p06JavaPackage;

import java.util.Arrays;
import java.util.StringJoiner;

public class Ex04String {
  public static void main(String[] args) {
    String str = "hello";
    String str1 = new String("hello");
    String str2 = "hello";
    String str3 = String.valueOf("hello");
    System.out.println(String.format("%s %s %s %s",str,str1,str2,str3));
    System.out.println(str == str1);
    System.out.println(str == str2);
    System.out.println("str == str3: " + (str == str3));
    System.out.println("str1 == str3: " + (str1 == str3));
    System.out.println(str.equals(str1));
    System.out.println(str.equals("HEllo")); //대소문자 구분
    System.out.println(str.equalsIgnoreCase("HEllo"));

    System.out.println(str.hashCode());
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    System.out.println(System.identityHashCode(str));
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
    System.out.println("str.intern() : " + str.intern());
    System.out.println("str1.intern() : " + str1.intern());
    System.out.println("str2.intern() : " + str2.intern());
    System.out.println("str.intern()==str1.intern() :" + (str.intern() == str1.intern()));
    System.out.println("str.intern()==str2.intern() :" + (str.intern() == str2.intern()));

    for (int i = 0; i < str.length(); i++) {
      System.out.println(str.charAt(i)); // charAt : 문자열의 한글자씩 출력
    }
    System.out.println(str.compareTo("Hello")); // 아스키코드 차이 비교
    System.out.println(str.compareTo("world")); // 아스키코드 차이 비교
    System.out.println(str.concat(" world")); // 합친 값을 출력 , 단 값이 변하진 않음.
    System.out.println(str);  //String의 인스턴스는 변형이 안된다.
    System.out.println(str.contains("hell"));// 글자가 포함되어 있는지
    System.out.println(str.startsWith("h")); // 시작하는 글자가 일치하는지
    System.out.println(str.endsWith("o")); // 끝나는 글자가 일치하는지
    System.out.println(str.indexOf("ll")); //글자의 위치를 반영
//    common.Util.typeOf((Object) "hello world");
    System.out.println("hello world".indexOf("l", 5));
    System.out.println("hello world".lastIndexOf("l"));

    System.out.println(str.replace("l", "k"));
    System.out.println(str.replace("o", ""));
    System.out.println(str.replaceFirst("l", "o"));

    String[] arr = "I am a boy".split(" "); // 잘라서 출력
    System.out.println(Arrays.toString(arr));

    String[] arr2 = "c:/workspace/space.Java".split("/");
    System.out.println(Arrays.toString(arr2));

    String name = "index.abc.html";
    System.out.println(name.substring(name.lastIndexOf(".")+1));
    System.out.println(name.substring(name.indexOf(".")+1, name.lastIndexOf(".")));
    System.out.println(name.substring(6, 9));
    System.out.println(str.toUpperCase());
    System.out.println(str.toUpperCase().toLowerCase());
    System.out.println("    blan    k    ".trim().replace(" ",""));
    System.out.println(String.valueOf(1));
    System.out.println(String.valueOf(0b10));
    System.out.println(String.valueOf(0010));
    System.out.println(String.valueOf(0xa0));
    StringJoiner sj = new StringJoiner(",", "*", "*");
    for(String s : arr){
      sj.add(s);
    }
    System.out.println(sj.toString());
  }
}