//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for (int i =0; i < nums.length; i++) {
            // 平方
            nums[i] = nums[i]*nums[i];
        }
        //冒泡排序
        for (int i =1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}

//双指针法

class Solution {
    public int[] sortedSquares(int[] nums) {
        int right = nums.length-1;
        int left = 0;
        int [] result = new int[nums.length];
        int p = result.length -1;
        //平方之后最大值就在数组的两端，不是最左边就是最右边 双指针
	// 比较头和尾的数谁大放末尾
        while (right >= left) {
            if (nums[right] * nums[right] > nums[left]*nums[left]) {
                // 存放在末尾
                result[p--] = nums[right] * nums[right];
                right--;
            }else {
                result[p--] = nums[left]*nums[left];
                left++;
            }
        }
        return result;
    }
}