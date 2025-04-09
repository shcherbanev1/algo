package medium.task2789;

class Solution {
    public long maxArrayValue(int[] nums) {
        long summator = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 1; i--) {
            if (summator >= nums[i - 1]) {
                summator += nums[i - 1];
            } else {
                summator = nums[i - 1];
            }
        }
        if (nums.length == 2) {
            if (nums[0] <= nums[1]) {
                return nums[0] + nums[1];
            }
        }
        return summator;
    }
}
