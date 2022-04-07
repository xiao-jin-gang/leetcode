// 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。



class Solution {
    public int[][] generateMatrix(int n) {
        int [][] mat = new int[n][n];
        int l = 0;  //左
        int r = n-1;  //右
        int t = 0;  //top
        int b = n-1;  //bottom
        int num = 1, target = n*n;
        while(num <= target) {  //没走到中心
            for (int i = l; i <= r; i++) {
                mat[t][i] = num++;  //上边元素加到末尾
            }
            t++;    //更新上边界
            for (int i = t; i <= b; i++) {
                mat[i][r] = num++;
            }
            r--;    //更新右边界
            for (int i = r; i >= l; i--) {
                mat[b][i] = num++;
            }
            b--;    //更新底部
            for (int i = b; i >= t; i--) {
                mat[i][l] = num++;
            }
            l++;    //更新左边界
        }
        return mat;
    }
}