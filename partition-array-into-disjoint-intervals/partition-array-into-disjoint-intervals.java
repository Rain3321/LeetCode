class Solution {
    public int partitionDisjoint(int[] nums) {
      int size = nums.length;
    int[] minNums = new int[size];
    minNums[size-1] = nums[size-1];

    for (int idx = minNums.length-2; idx >= 0; idx--) {
      minNums[idx] = Math.min(minNums[idx+1], nums[idx]);
    }
    int max = nums[0];
    int i = 1;
    while (i < size) {
      max = Math.max(max, nums[i-1]);
      if(max <= minNums[i]) break;
      ++i;
    }
    return i;
    }
}