class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<banned.length;i++){
            mp.put(banned[i],mp.getOrDefault(banned[i],0)+1);
        }
        int sum = 0; 
        int ans = 0;
        for(int i = 1;i<=n;i++){
            if(!mp.containsKey(i)){
                sum += i;
                if(sum>maxSum){
                    break;
                }
                ans++;
            }
        }
        return ans;
    }
}