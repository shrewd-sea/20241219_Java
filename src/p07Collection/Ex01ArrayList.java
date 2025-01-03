package p07Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01ArrayList {
  public static void main(String[] args) {
    List list3 = new ArrayList();
    for (int i = 1; i < 11; i++) {
      list3.add(i);
    }
    System.out.println(list3);

    List listint = new ArrayList();
    listint.add(0); listint.add(1); listint.add(2);
    listint.add(true); listint.add("hello");
    System.out.println(listint);
    List list = new ArrayList<>(); // 클래스가 인터페이스로 형변환
    Member m1 = new Member("lgh","정", "1");
    list.add(m1);
    list.add(new Member("lgh","성","1"));
    list.add(new Member("mgh","호","1"));
    list.add(new Member("rgh","호","1"));
    System.out.println(list);
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    for (Object o : list){
      System.out.println((Member)o); // 한줄씩 나열
    }
    Iterator it = list.iterator();
    while (it.hasNext()){
      System.out.println(it.next());
    }
  }
}

class Member {
  private String id, name, pass;

  public Member(String id, String name, String pass) {
    this.id = id;
    this.name = name;
    this.pass = pass;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  @Override
  public String toString() {
    return String.format("id=%s, name=%s, pass=%s" , id, name, pass);
  }
}