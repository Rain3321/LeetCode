class Solution {
  public int[] productExceptSelf(int[] sums) {
    int[] output = new int[sums.length];
    int left = 1;
    int right = 1;
    for (int i = 0; i < sums.length; i++) {
      output[i] = left;
      left *= sums[i];
    }

    for (int i = sums.length - 1; i >= 0; i--) {
      output[i] *= right;
      right *= sums[i];
    }
    
    return output;
  }
}