public class Bytes {
    public static void main(String[] args) {
        Bytes bytes = new Bytes();
        int [] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Bytes b = new Bytes();
        int maxSubArray = b.maxSubArray(nums);
        System.out.println(maxSubArray);
    }

    // 53.最大子数组和 动态规划问题
    // 分解问题：求以nums[i]结尾的数组最大和是多少
    // 用dp[i]记录当前结尾的最大和 if(dp[i-1]<=0) dp[i]=nums[i]
    // if(dp[i-1]>0) dp[i]=dp[i-1]+nums[i]
    // 最后遍历其数组
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int [] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++ ) { //遍历数组
            if (dp[i-1] <= 0) {		 // 前i-1项小于0
                dp[i] = nums[i];	 //dp[i]等于当前i的值，因为负数在加任何数都比nums[i]小
            }
            else {
                dp[i] = dp[i-1]+nums[i];
            }
        }
        // 遍历dp数组，得到最大值
        int res = dp[0];
        for (int i= 1; i<dp.length; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}