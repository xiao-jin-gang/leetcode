class Solution {
    //79.单词搜索
    public boolean exist(char[][] board, String word) {
//        char[] words = word.toCharArray();
        int h = board.length,w = board[0].length;
        boolean[][] visited = new boolean[h][w];    //标记数组
        for (int i = 0 ; i < h; i++){
            for (int j = 0; j < w; j++){
                boolean flag = bfs(board,visited,i,j,word,0);
                if (flag){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean bfs(char[][] board,boolean[][] visited,int row, int col, String word, int k){
        // 不在网格内
        if (!inArea(board, row, col)){
            return false;
        }
        if (visited[row][col]){
            return false;
        }
        //字符不等
        if (board[row][col] !=word.charAt(k)){
            return false;
        }
        //全部字符匹配
        if (k == word.length()-1){
            return true;
        }
        //当前字符匹配 做访问标记
        visited[row][col] = true;

        // 当前点四个方向匹配下一个字符
       boolean f = bfs(board,visited,row - 1, col,word,k+1) ||
        bfs(board,visited,row + 1, col,word,k+1) ||
        bfs(board,visited,row, col-1,word,k+1) ||
        bfs(board,visited,row, col+1,word,k+1);
       if (f==true){
           return true;
       }
        // 回溯修改当前不能访问的点 但是接下来的方向可以访问它
       visited[row][col] = false;
       return false;
    }
     public boolean inArea(char[][] a, int i, int j) {
        if (0 <= i && i < a.length && 0 <= j && j < a[0].length)
            return true;
        return false;
    }
}