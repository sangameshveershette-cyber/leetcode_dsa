class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int n : nums){
            if(n<min)
            min = n;
            if(n>max)
            max = n;
        }
        for(int i=min;i>=1;i--){
            if(min%i==0 && max%i==0)
            return i;
        }
        return 1;
    }
}