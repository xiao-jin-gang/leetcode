class Solution { 
public static void main(String[] args) throws InterruptedException, SigarException {
        cpu c = new cpu();

         String [] strs = {"flower","flow","floweht"};
        System.out.println(c.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int x = strs[0].length();   // 宽
        int y = strs.length;        // 高
        for (int i = 0; i < x; i++) {          // kuan
            for (int j = 0; j < y; j++) {       // gao
                if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}