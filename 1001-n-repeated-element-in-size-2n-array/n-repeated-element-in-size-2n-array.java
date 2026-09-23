class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans = 0;
        for(int i =0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int key : mp.keySet()){
            if(mp.get(key) == nums.length/2){
                ans = key;
            }
        }
        return ans;
    }
}