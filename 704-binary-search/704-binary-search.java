class Solution {
  public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (mid >= nums.length) {
        break;
      }
      if (nums[mid] > target) {
        right = mid - 1;
      } else if(nums[mid] < target) {
        left = mid + 1;
      } else {
        return mid;
      }
    }

    return -1;
  }
}