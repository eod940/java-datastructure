package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Practice1 {

  static int N, M, CASES;
  static int[][] dp = new int[30][30];

  static int comb(int n, int r) {
    // 가장자리 1만들기
    if (n == r || r == 0)
      return 1;

    // 중복값 반환
    if (dp[n][r] > 0)
      return dp[n][r];

    return dp[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    CASES = Integer.parseInt(br.readLine());
    int[] arr = new int[CASES];

    for (int i = 0; i < CASES; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      M = Integer.parseInt(st.nextToken());
      N = Integer.parseInt(st.nextToken());

      arr[i] = comb(N, M);
    }

    System.out.println(Arrays.toString(arr));
  }

}
