class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // T.C: O(n)
        // S.C: O(1)
        if (nums == null || nums.length == 0)
            return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = nums[index] * -1;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) 
                result.add(i+1);
            else
                nums[i] = nums[i] * -1;
        }
        return result;
    }
}