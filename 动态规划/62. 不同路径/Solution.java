// 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。

//机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。

//问总共有多少条不同的路径？







class Solution {
    public int uniquePaths(int m, int n) {
        // 1.确定dp数组及下标含义
        //dp[i][j] ：表示从（0 ，0）出发，到(i, j) 有dp[i][j]条不同的路径。

        // 确定递推公式
        // dp[i][j] = dp[i-1][j] + dp[i][j-1]过来

        // 3. 数组初始化
        int [][]dp = new int[m][n];
        for (int i = 0; i< m;i++){
            dp[i][0] = 1;
        }
        for (int j = 0; j< n;j++){
            dp[0][j] = 1;
        }
        // 确定遍历顺序 先行在列
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++ ){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}