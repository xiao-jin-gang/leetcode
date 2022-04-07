// 暴力解决法
// 循环遍历数组，然后
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = Integer.MAX_VALUE;  		// 记录个数
        int sum = 0;    				// 记录和
        int tmp = Integer.MAX_VALUE;			// 记录最小连续子数组
        for (int i = 0; i < nums.length; i++) {		// 遍历数组
            for (int j  = i; j < nums.length; j++) {
                sum = sum + nums[j];			
                if ( sum >= target ) {			// 当前数组和大于目标值
                    count = j - i + 1;			// 记录长度
                    break;
                }
            }
            sum = 0;
            tmp = Math.min(count,tmp);
        }
        if(count == Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return tmp;
        }
    }
}

// 滑动窗口解决：
// 定义两个指针start 和end分别表示子数组（滑动窗口窗口）的开始位置和结束位置，维护变量 \textit{sum}sum 存储子数组中的元素和（即从 \text{nums}[\textit{start}]nums[start] 到 \text{nums}[\textit{end}]nums[end] 的元素和）。
 
public int minSubArrayLen(int target, int[] nums) {
        // 滑动窗口解决：
        // 定义两个指针start 和end分别表示子数组（滑动窗口窗口）的开始位置和结束位置，维护变量 \textit{sum}sum 存储子数组中的元素和（即从 \text{nums}[\textit{start}]nums[start] 到 \text{nums}[\textit{end}]nums[end] 的元素和）。
        int left = 0;  // 当滑动窗口值大于target
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                // 得到连续数组个数
                result = Math.min(result,right -left + 1);
                // 调整left值
                sum -= nums[left];
                left++;
            }
        }
        return result == Integer.MAX_VALUE? 0 : result;
    }