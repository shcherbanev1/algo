package medium.task2962;

class Solution {

    public long countSubarrays(int[] nums, int k) {
        long ans = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int point = 0;
        int endMax = 0;
        int startMax = 0;
        int maxCount = 0;
        while (endMax < nums.length) {
            while (endMax < nums.length && maxCount != k) {
                if (nums[endMax] == max) {
                    maxCount++;
                }
                endMax++;
            }
            endMax--;
            while (startMax < nums.length && nums[startMax] != max) {
                startMax++;
            }
            if (maxCount == k) {
                ans += (long) (startMax + 1 - point) * (nums.length - endMax);
                point = startMax + 1;
            }
            startMax++;
            endMax++;
            maxCount--;
        }
        return ans;
    }

}
