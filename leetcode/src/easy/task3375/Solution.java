package easy.task3375;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num < k) {
                return -1;
            }
            set.add(num);
        }
        for (int num : set) {
            if (num > k) {
                ans++;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minOperations(new int[]{5, 2, 5, 4, 5}, 2));
    }

}