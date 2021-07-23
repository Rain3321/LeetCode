class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    for (int start = 0; start < nums.length-1; start++) {
      
      for(int end = start+1; end < nums.length; end++) {
        if(nums[start] + nums[end] == target)
          return new int[] {start, end};
      }
    }
    return null;
    }
}