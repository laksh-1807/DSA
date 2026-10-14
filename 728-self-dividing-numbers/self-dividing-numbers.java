class Solution {
    public boolean solve(int n){
        if(n<10) return true;
        int x = n;
        while(x>0){
            int digit = x % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            x = x/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(solve(i)){
                list.add(i);
            }
        }
        return list;
    }
}