//给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                count++;
            }
            else {
                // 等于0
                maxcount = Math.max(maxcount,count);
                count = 0;
            }
        }
	// 判断末尾是否为1 是1还要在重新比较一下
        if(nums[nums.length-1] == 1){
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}