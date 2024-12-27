package p02method;

import java.util.Date;

public class Ex04constructor {
  public static void main(String[] args) {
    Student s1 = new Student(1, "JSH", "010", new Date());
    System.out.println(s1.getStdNo());
    System.out.println(s1.getName());
    System.out.println(s1.getRegDate());
    s1.setStdNo(1);
    s1.setName("JSH");
    s1.setMobile("010");
    s1.setRegDate(new Date());

  }
}

class Student {
  public Student(){}
  public Student(int stdNo, String name, String mobile, Date regDate) {
    this.stdNo = stdNo; this.name = name; this.mobile = mobile; this.regDate = regDate;
  }
  private int stdNo;
  private String name;
  private String mobile;

  public Date getRegDate() {
    return regDate;
  }

  public void setRegDate(Date regDate) {
    this.regDate = regDate;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStdNo() {
    return stdNo;
  }

  public void setStdNo(int stdNo) {
    this.stdNo = stdNo;
  }

  private Date regDate;
}

