 public static void main(String[] args) {
        Bytes bytes = new Bytes();
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = bytes.removeDuplicates(nums);
        System.out.println(i);
    }
    public int removeDuplicates(int[] nums) {
        // 运用双指针来解决
       int p=0,q = 1;
       if (nums ==null || nums.length ==0) {
           return 0;
       }
       // p为前指针 q为后指针
       while( q < nums.length ) {
            if (nums[p] != nums[q]) {
                nums[p+1] = nums[q];
                p++;
            }
            q++;
       }
       return p+1;
    }