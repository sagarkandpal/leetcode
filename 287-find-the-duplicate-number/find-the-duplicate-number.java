class Solution {
    public int findDuplicate(int[] nums) {
        
        int i=0;
        int n = nums.length;
        while(i < n){
            int j = nums[i]-1;
            if(nums[i] != nums[j]){

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            else if(nums[i] == nums[j] && i != j){
                return nums[i];
            }
            else{
                i++;
            }
        }

        // for(int in=0; in<n; in++){
        //     if(nums[in] != in+1){
        //         return nums[in];
        //     }
        // }

        return -1;
    }
}