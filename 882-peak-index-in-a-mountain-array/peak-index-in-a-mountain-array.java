class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int max = 0;
        while(low<high){
            int mid = low + (high - low)/2;
            int x = arr[mid];
            if(arr[mid-1]>x){
                high = mid;
            }else if(arr[mid+1]>x){
                low = mid +1;
            }else{
                max = mid;
                break;
            }
        }
        return max;
    }
}