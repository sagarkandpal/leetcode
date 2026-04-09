class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;

        int[] result = new int[n];
        for(int i=0; i<n; i++){
            int p = nums1[i];
            int idx = -1;
            
            int j;
            for(j=0; j<m; j++){
                if(nums1[i] ==  nums2[j]){
                    break;
                }
            }

            for(int k=j+1; k<m; k++){
                if(nums2[k] > p){
                    idx = nums2[k];
                    break;
                }
            }
            result[i] = idx;
        }      
        return result;
    }
}