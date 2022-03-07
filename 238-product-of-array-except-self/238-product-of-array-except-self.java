class Solution {
public int[] productExceptSelf(int[] sums) {
    int sum = 1;
    int excludeSum = 1;
    int cnt = 0;
    for (int i : sums) {
      sum *= i;
      if (i != 0) {
        excludeSum *= i;
      } else {
        cnt++;
      }
    }
    int finalSum = sum;
    int finalExcludeSum = excludeSum;
    int finalCnt = cnt;
    return Arrays.stream(sums)
      .map(num -> {
        if (num == 0) {
          if (finalCnt > 1) {
            return 0;
          } else {
            return finalExcludeSum;
          }
        } else {
          return finalSum / num;
        }
      })
      .toArray();
  }
}