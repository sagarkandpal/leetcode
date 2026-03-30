class Solution {
    public int findMiddleIndex(int[] nums) {

        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }

        int leftsum = 0;
        for(int i=0; i<n; i++){
            int rightsum = sum - nums[i] - leftsum;
            if(leftsum == rightsum){
                return i;
            }
            leftsum = leftsum + nums[i];
        }

        return -1;

        








    }
}

// int leftsum = 0;
//         int rightsum = 0;
//         int n = nums.length;

//         for(int i=0; i<n; i++){
//             leftsum = 0;
//             rightsum = 0;
//             for(int j=0; j<i; j++){
//                 leftsum += nums[j];
//             }
//             for(int j=i+1; j<n; j++){
//                 rightsum += nums[j];            
//             }
//             if(leftsum == rightsum){
//                 return i;
//             }
//         }
//         return -1;