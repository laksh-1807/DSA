class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                if (mp.get(0) >= 2) {
                    return true;
                }
            }else{
            if(mp.containsKey(2*arr[i])) return true;
            }
        }
        return false;
    }
}