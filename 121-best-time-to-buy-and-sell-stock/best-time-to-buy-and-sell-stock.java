class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int p:prices){
            if(min>p){
                min=p;
            }
            if(p-max>min){
                max=p-min;
            }
        }
        return max;
    }
}