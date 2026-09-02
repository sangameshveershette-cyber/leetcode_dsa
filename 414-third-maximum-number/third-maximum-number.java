class Solution {
    public int thirdMax(int[] nums) {
     Arrays.sort(nums);
     int i=0,
     j=nums.length-1;
     while(i<j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
     }   
     int elemCount = 1;
    for(int k=1;k<nums.length;k++){
        if(nums[k] != nums[k-1]){
            elemCount++;
        }
        if(elemCount == 3){
            return nums[k];
        }
    }
    return nums[0];
    }
}