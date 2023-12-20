package sorting;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    // 버블소트 구현
    int[] arr = new int[10];
    int idx = 0;

    for (int i = 10; i > 0; i--) {
      arr[idx] = i;
      idx += 1;
    }
    System.out.println("정렬 전");
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < 10; i++) {
      for (int j = i + 1; j < 10; j++) {
        if (arr[j] < arr[i]) {
          arr[j] = arr[i] ^ arr[j];
          arr[i] = arr[i] ^ arr[j];
          arr[j] = arr[i] ^ arr[j];
        }
      }
    }
    System.out.println("정렬 후");
    System.out.print(Arrays.toString(arr));
  }
}
