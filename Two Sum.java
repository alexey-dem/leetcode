class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] mas = new int[2];
        
        for (int i = 0; i < nums.length - 1; i++) {
            int low = target - nums[i];
            
            for (int j = i + 1; j < nums.length; j++) {
                if (j == i) continue;
                if (low == nums[j]) {
                    mas[0] = i;
                    mas[1] = j;
                    return mas;
                }
            }
        }
        
        return mas;
    }
}