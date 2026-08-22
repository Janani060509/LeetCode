class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        
        int sumOfn=(n*(n+1))/2;
        int sumOfnum=0;
        for(int i=0;i<n;i++){
            sumOfnum = sumOfnum + nums[i];
            
        }
        int res=sumOfn-sumOfnum;
        return res;
    }
}