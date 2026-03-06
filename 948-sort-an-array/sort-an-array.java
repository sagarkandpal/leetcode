class Solution {

    public static void mergeSort(int[] arr, int n){
        if(n < 2){
            return;
        }

        int mid = n/2;
        int[] leftarr = new int[mid];
        int[] rightarr = new int[n - mid];

        for(int i=0; i<mid; i++){
            leftarr[i] = arr[i];
        }
        for(int i=mid; i<n; i++){
            rightarr[i - mid] = arr[i];
        }

        mergeSort(leftarr, mid);
        mergeSort(rightarr, n - mid);

        finalmerge(arr, leftarr, rightarr, mid, n - mid);
    }

    public static void finalmerge(int[] arr, int[] leftarr, int[] rightarr, int left, int right){

        int i=0, j=0, k=0;

        while(i < left && j < right){
            if(leftarr[i] <= rightarr[j]){
                arr[k++] = leftarr[i++];
            }
            else{
                arr[k++] = rightarr[j++];
            }
        }

        while(i < left){
            arr[k++] = leftarr[i++];
        }

        while(j < right){
            arr[k++] = rightarr[j++];
        }
    }
    public int[] sortArray(int[] arr) {
        
        int n = arr.length;
        mergeSort(arr, n);

        return arr;
    }
}