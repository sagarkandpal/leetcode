class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0;
        int bottom = n-1;

        while(top <= bottom){
            int mid = (top + bottom)/2;

            if(target > matrix[mid][m-1]){
                top = mid + 1;
            }    
            else if(target < matrix[mid][0]){
                bottom = mid - 1;
            }  
            else{

                int left = 0;
                int right = m-1;

                while(left <= right){
                    int mid2 = (left + right)/2;

                    if(matrix[mid][mid2] == target){
                        return true;
                    }
                    else if(matrix[mid][mid2] < target){
                        left = mid2 + 1;
                    }
                    else{
                        right = mid2 - 1;
                    }
                }
                return false;
            } 
        }
        return false;
        
    }
}








// brute force - timecom = 0(m*n)
// int row = matrix.length;
// int col = matrix[0].length;

// if(matrix == null || row == 0 || col == 0){
//     return false;
// }

// for(int i=0; i<row; i++){
//     for(int j=0; j<col; j++){
//         if(matrix[i][j] == target){
//             return true;
//         }
//     }
// }
// return false;
