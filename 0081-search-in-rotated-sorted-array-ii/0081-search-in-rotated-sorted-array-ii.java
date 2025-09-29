class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int first = 0;
        int last = n - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (nums[mid] == target) return true;
            if (nums[first] == nums[mid] && nums[mid] == nums[last]) {
                first += 1;
                last -= 1;
                continue;
            }
            if (nums[first] <= nums[mid]) {
                if (nums[first] <= target && target <= nums[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            } else {
                if (nums[last] >= target && target >= nums[mid]) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
        }
        return false;
    }
}