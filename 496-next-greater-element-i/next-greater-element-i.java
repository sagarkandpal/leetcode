class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<nums2.length; i++){
            while(!st.isEmpty() && st.peek() < nums2[i]){
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        for(int i : st){
            map.put(i, -1);
        }

        for(int i=0; i<nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}






// brute force

//  int n = nums1.length;
//         int m = nums2.length;

//         int[] result = new int[n];
//         for(int i=0; i<n; i++){
//             int p = nums1[i];
//             int idx = -1;
            
//             int j;
//                 if(nums1[i] ==  nums2[j]){
//                     break;
//                 }
//             }

//             for(int k=j+1; k<m; k++){
//                 if(nums2[k] > p){
//                     idx = nums2[k];
//                     break;
//                 }
//             }
//             result[i] = idx;
//         }      
//         return result;