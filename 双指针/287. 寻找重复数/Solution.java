//给定一个包含 n + 1 个整数的数组 nums ，其数字都在 [1, n] 范围内（包括 1 和 n），可知至少存在一个重复的整数。

//假设 nums 只有 一个重复的整数 ，返回 这个重复的数 。

class Solution {
    // ========================================快慢指针
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int slow = 0;   // 慢指针
        int fast = 0;   // 快指针
        // 先走一次
        slow = nums[slow];
        fast = nums[nums[fast]];
        while (slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        // 相遇 ，新建节点
        int behind = 0;
        while (slow != behind){
            slow = nums[slow];
            behind = nums[behind];
        }
        return behind;
    }
}