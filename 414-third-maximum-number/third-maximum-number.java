class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[nums.length-1];
        int count = 0;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i] == nums[i+1]){
                continue;
            }
            ans = nums[i];
            count++;
            if(count == 2) break;
        }
        if(count<2) return nums[nums.length-1];
        return ans;
    }
}