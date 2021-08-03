class Solution {
  Set<List<Integer>> set = new HashSet<>();
  public List<List<Integer>> subsetsWithDup(int[] nums) {

    recursion(nums, new boolean[nums.length], 0);

    return new ArrayList<>(set);
  }

  private void recursion(int[] nums, boolean[] booleans, int i) {
    if(i == booleans.length) {
      List<Integer> list = new ArrayList<>();
      for (int j = 0; j < booleans.length; j++) {
        if(booleans[j]) {
          list.add(nums[j]);
        }
      }
      Collections.sort(list);
      set.add(list);
      //System.out.println(list);
      return;
    }
    booleans[i] = true;
    recursion(nums, booleans, i+1);

    booleans[i] = false;
    recursion(nums, booleans, i+1);
  }
}