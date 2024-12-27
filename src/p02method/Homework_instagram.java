package p02method;

import java.util.Date;

public class Homework_instagram {
  public static void main(String[] args) {
    Instagram insta = new Instagram(new Video("영상제목", "재생"), "닉네임", new Date());
    System.out.println(insta.post);
    System.out.println(insta.name);
    System.out.println(insta.regDate);
    insta.instaGood();
    insta.post.play();
    insta.post.adjustVolume(50);
  }
}

class Instagram {

  public Instagram(Video post, String name, Date regDate) {
    this.name = name;
    this.post = post;
    this.regDate = regDate;
  }

  String name;
  Video post;
  Date regDate;

  private boolean interest;

  void instaGood() {
    interest = !interest;
    System.out.println(interest ? "좋아요" : "무관심");
  }

  private int shareCount;

  void sharePost() {
    shareCount++;
    System.out.println(shareCount + "번 째로 공유하셨어요.");
  }
}

class Video {
  String playTitle;
  String videoPlay;
  int volume = 100;

  public Video(String playTitle, String videoPlay) {
    this.playTitle = playTitle;
    this.videoPlay = videoPlay;
  }

  void play() {
    System.out.println("영상 재생 중: " + playTitle + " (" + videoPlay + ")");
  }

  void adjustVolume(int newVolume) {
    if (newVolume >= 0 && newVolume <= 100) {
      volume = newVolume;
      System.out.println("음량이 " + volume + "%로 조정되었습니다.");
    } else {
      System.out.println("음량은 0%에서 100% 사이여야 합니다.");
    }
  }
}
