class SolutionSort {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0 ; i  < nums.length ; i++){
            if (i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
//if you copy and submit the code above, ensure to modify the class name to Solution
