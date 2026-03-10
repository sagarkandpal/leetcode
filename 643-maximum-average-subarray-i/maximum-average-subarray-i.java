class Solution {
    public double findMaxAverage(int[] nums, int k) {

       int n = nums.length;
       int start = 0;
       int end = k;
       int sum = 0;
       for(int i=0; i<k; i++){
          sum = sum + nums[i];
       } 

       int maxsum = sum;
       while(end < n){
          sum = sum - nums[start] + nums[end];
          maxsum = Math.max(sum, maxsum);
          start++;
          end++;
       }

       return (double) maxsum/k;
    }
}