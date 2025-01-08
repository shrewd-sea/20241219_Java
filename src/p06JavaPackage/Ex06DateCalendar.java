package p06JavaPackage;

import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;

public class Ex06DateCalendar {
  public static void main(String[] args) {
    Date d1 = new Date();
    System.out.println(d1);
    System.out.println(d1.getYear()+1900);
    System.out.println(getDate(d1));
    System.out.println(getTime(d1));
    StringJoiner sj = new StringJoiner("", "", "");
    sj.add(getDate(d1));sj.add(getTime(d1));
    System.out.println(sj.toString());
    System.out.println(getDate(d1)+" "+getTime(d1));

    Calendar c = Calendar.getInstance();
    System.out.println(c.get(Calendar.YEAR));
    System.out.println(c.get(Calendar.YEAR));
    System.out.println(c.get(Calendar.MONTH));
    System.out.println(c.get(Calendar.DATE));
    String[] weeks = ",일,월,화,수,목,금,토".split(",");// 모든 문자열은 String의 메서드
    System.out.println(weeks[c.get(Calendar.DAY_OF_WEEK)]); // [] 안에 index 숫자를 넣으면 index 배열에 맞는 문자열 출력.
    System.out.println(c.get(Calendar.HOUR)); //12시간제
    System.out.println(c.get(Calendar.HOUR_OF_DAY));//24시간제
    c.set(2024,11,1); // 날짜 직접 지정하는 법

    // Date => Calendar
    Date d = new Date();
    Calendar c1 = Calendar.getInstance();
    c1.setTime(d);

    // Calendar => Date
//    Date d2 = new Date(Calendar.getInstance().getTimeInMillis());
  }
  static String getDate(Date date) {
    int month = date.getMonth() + 1;
    int day = date.getDate();
    return  date.getYear()+1900 + "-"
        + (month < 10? "0"+ month : month)+ "-"
        + (day < 10? "0"+ day : day);
    // yyyy - mm - dd
  }

  static String getTime(Date date) {
    int hour = date.getHours();
    int min = date.getMinutes();
    int sec = date.getSeconds();
        return String.format("%d : %d : %d",
            (hour < 10? "0" + hour : hour),
            (min < 10? "0" + min : min),
            (sec < 10? "0" + sec : sec));
        // hh : mm : ss
  }
}
