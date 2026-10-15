class Solution {
    public boolean solve(int[] arr, int start,boolean[] visit){
        if(start <0 || start >= arr.length) return false;
        if(arr[start] == 0) return true;
        if(visit[start]){
            return false;
        }
        visit[start] = true;
        return solve(arr,start+arr[start],visit) || solve(arr,start-arr[start],visit);
    }
    public boolean canReach(int[] arr, int start) {
        boolean[] visit = new boolean[arr.length];
            return solve(arr,start,visit);
    }
}