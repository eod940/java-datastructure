package sorting;

import java.util.*;
import java.io.*;

public class ComparatorTest {

  static BufferedReader br;
  static StringTokenizer st;
  static int N;

  static class DotOrigin implements Comparable<Dot> {

    // loc: 위치, col = 색깔
    int loc, col;

    @Override
    public int compareTo(Dot other) {
      return col - other.col;
    }
  }

  static class Dot implements Comparator<Dot> {

    // loc: 위치, col = 색깔
    int loc, col;

    @Override
    public int compare(Dot dot1, Dot dot2) {
      if (dot1.col != dot2.col) {
        return dot1.col - dot2.col;
      }
      return dot1.loc - dot2.loc;
    }
  }

  static class DotCompare implements Comparator<Dot> {

    @Override
    public int compare(Dot dot1, Dot dot2) {
      if (dot1.col != dot2.col) {
        return dot1.col - dot2.col;
      }
      return dot1.loc - dot2.loc;
    }
  }

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    Dot[] dots = new Dot[N];

    for (int i = 0; i < N; i++) {
      dots[i] = new Dot();
      st = new StringTokenizer(br.readLine());
      dots[i].loc = Integer.parseInt(st.nextToken());
      dots[i].col = Integer.parseInt(st.nextToken());
    }
    Integer[] testInts = {4, 2, 5, 3, 1};

    // Collections.sort()는 Collections에 객체가 담긴것만 가능한듯?
//    Collections.sort(testInts);
    Arrays.sort(dots, new DotCompare());
    System.out.println("==== 정렬 ====");

    for (int i = 0; i < N; i++) {
      System.out.print(dots[i].loc + " ");
      System.out.println(dots[i].col);
    }
  }
}
