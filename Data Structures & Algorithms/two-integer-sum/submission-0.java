class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indic = {-1, -1};
        boolean loopStop = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if ((nums[i] + nums[j]) == target && j != i) {
                    indic[0] = i;
                    indic[1] = j;
                    loopStop = true;
                    break;
                }
            }
            if (loopStop) {
                break;
            }
        }
        return indic;
    }
}
