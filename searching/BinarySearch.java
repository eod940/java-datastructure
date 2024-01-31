package searching;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = {1, 2, 5, 6, 8, 9, 12};
    int n = 12;
    System.out.printf("%d의 index: %d", n, rank(n, arr));
  }

  public static int rank(int key, int[] a) {
    return rank(key, a, 0, a.length - 1);
  }

  public static int rank(int key, int[] a, int lo, int hi) {
    // a[]에 저장된 key의 인덱스는 만약 존재한다면
    // lo보다 작을 수 없고 hi보다 클 수 없다.
    if (lo > hi) return -1;
    int mid = (lo + hi) / 2;
    if      (key < a[mid]) return rank(key, a, lo, mid - 1);
    else if (key > a[mid]) return rank(key, a, mid +1, hi);
    else                   return mid;
  }
}
