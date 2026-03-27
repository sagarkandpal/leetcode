class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int i=0;
        int n = nums.length;
        while(i < n){
            int j = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[j]){

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            else{
                i++;
            }
        }

        for(int in=0; in<n; in++){
            if(nums[in] != in+1){
                return in+1;
            }
        }

        return n+1;
    }
}