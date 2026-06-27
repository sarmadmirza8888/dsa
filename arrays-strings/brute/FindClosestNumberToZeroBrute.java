class FindClosestNumberToZeroBrute {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            boolean isBest = true;
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(nums[j]) < Math.abs(nums[i])) {
                    isBest = false;
                    break;
                }
                if (Math.abs(nums[j]) == Math.abs(nums[i]) && nums[j] > nums[i]) {
                    isBest = false;
                    break;
                }
            }
            if (isBest) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-4, -2, 1, 4, 8};
        System.out.println(new FindClosestNumberToZeroBrute().findClosestNumber(nums)); // Output: 1
    }
}