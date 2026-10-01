class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans = -1;
        for(int i = 0;i<nums1.length;i++){
            mp.put(nums1[i],mp.getOrDefault(nums1[i],0)+1);
        }
        for(int i = 0;i<nums2.length;i++){
            if(mp.containsKey(nums2[i])){
              ans = nums2[i];
              break;
            }
        }
        return ans;
    }
}