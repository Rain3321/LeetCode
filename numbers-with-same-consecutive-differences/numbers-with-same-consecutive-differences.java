class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
    if(n == 1) {
      return new int[] {0,1,2,3,4,5,6,7,8,9};
    }
    else {
      List<Integer> result = new ArrayList<>();
      for (int i = 1; i < 10; i++) {
        makeNumbers(n-1, k, result, i);
      }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
  }

  private void makeNumbers(int n, int k, List<Integer> result, int i) {
    if (n == 0) {
      result.add(i);
      return;
    }
    int currentNum = i % 10;
    if(k == 0) {
      makeNumbers(n-1, k, result, i * 10 + currentNum);
    }
    else {
      if(currentNum + k <= 9) makeNumbers(n-1, k, result,i * 10 + currentNum + k);
      if(currentNum - k >= 0) makeNumbers(n-1, k, result, i * 10 + currentNum -k);
    }
  }
}