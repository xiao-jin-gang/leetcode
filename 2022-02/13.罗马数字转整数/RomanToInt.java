//解法1
class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for (int i =1; i <s.length(); i++){
            int num = getValue(s.charAt(i));
            if (num > preNum){
                // 后一个大于前一个  减去
                sum = sum + (-preNum);
            }
            else {
                sum = sum + preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
    private int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
//解法2：
// public int romanToInt(String s) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("I",1);
//        map.put("IV", 4);
//        map.put("V", 5);
//        map.put("IX", 9);
//        map.put("X", 10);
//        map.put("XL", 40);
//        map.put("L", 50);
//        map.put("XC", 90);
//        map.put("C", 100);
//        map.put("CD", 400);
//        map.put("D", 500);
//        map.put("CM", 900);
//        map.put("M", 1000);
//        int ans = 0;
//        for (int i = 0; i < s.length();){
//            if (i+1 < s.length() && map.containsKey(s.substring(i,i+2))){
//                ans += map.get(s.substring(i,i+2));
//                i += 2;
//            }else {
//                ans += map.get(s.substring(i,i+1));
//                i ++;
//            }
//        }
//        return ans;
//    }
