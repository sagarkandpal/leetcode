class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int start = 0;
        long sum = 0;
        long maxsum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int end=0; end<nums.length; end++){
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            sum = sum + nums[end];

            while(map.get(nums[end]) > 1){
                map.put(nums[start], map.get(nums[start]) - 1);
                sum = sum - nums[start];
                start++;
            }

            if(end - start + 1 == k){
                maxsum = Math.max(sum, maxsum);

                map.put(nums[start], map.get(nums[start]) - 1);
                sum = sum - nums[start];
                start++;
            }
        }
        return maxsum;
    }
}











    //    int n = nums.length;
    //    int start = 0;
    //    int end = k;
    //    int sum = 0;
    //    int maxsum = 0;
    //    for(int i=0; i<end; i++){
    //       sum = sum + nums[i];
    //    } 
    //    start++;
    //    end++;
    //    maxsum = sum;
    //    while(end < n){
    //       sum = sum - nums[start-1] + nums[end];
    //       maxsum = Math.max(sum, maxsum);
    //       start++;
    //       end++;
    //    }

    //    return maxsum;