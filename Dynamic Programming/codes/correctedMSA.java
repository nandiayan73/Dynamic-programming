
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // edge case handling
        }
        
        int maxSum = nums[0]; // Initialize with the first element
        int currentSum = nums[0]; // Keep track of the current subarray sum
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add the current element to the existing subarray or start a new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
