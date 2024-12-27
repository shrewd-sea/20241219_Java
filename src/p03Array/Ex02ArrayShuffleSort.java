package p03Array;

//import common.Util;

import java.util.Arrays;

public class Ex02ArrayShuffleSort {
  public static void main(String[] args) {
    int[] arr = new int[10];
    int tot = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
//      arr[i] = Util.rand(10) + 1;
      if (i != 0) System.out.print(", ");
      System.out.print(arr[i]);
      tot += arr[i];
    }
    System.out.println();
    System.out.println(Arrays.toString(arr));
    System.out.println(
        String.format("total: %d, average: %4.2f",
            tot, (float) tot / arr.length));

    for (int i = 0; i < arr.length; i++) {
      int r = (int) (Math.random() * 10);
      int tmp = arr[i];
      arr[i] = arr[r];
      arr[r] = tmp;
    }
    System.out.println(Arrays.toString(arr));

    int[] lotto = new int[6];
    for (int l = 0; l < lotto.length; l++) {
      lotto[l] = (int) (Math.random() * 45) + 1;
      if (l != 0)
        System.out.print(", ");
      System.out.println(Arrays.toString(lotto));
    }

    // 정렬
//    bubbleSort(arr);
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      boolean change = false;
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
          change = true;
        }
      }
      if (!change) break;
    }
  }

  static void selectionSort(int[] arr) {
    /*
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]){
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        } // 작으면 무조건 자리바꿈한다. 비효율적
      }
    }
    */

    // 성능 개선 :: 작은 것의 최종 인덱스를 j 반복문이 끝난 후 교체
    for (int i = 0; i < arr.length - 1; i++) {
      int minIdx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[i]) {
          minIdx = j;
        }
      }
      if (minIdx != i) {
        int tmp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = tmp;
      }
    }
  }
}