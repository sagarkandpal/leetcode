class NumArray {

    public ArrayList<Integer> prefix =new ArrayList<>();

    public NumArray(int[] nums) {
        int n = nums.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prefix.add(sum);
        }
        
    }
    
    public int sumRange(int left, int right) {
        if (left ==0) return prefix.get(right);

        return prefix.get(right) -prefix.get(left-1);
        
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */