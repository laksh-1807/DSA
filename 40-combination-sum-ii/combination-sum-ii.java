class Solution {
    public void solve(int[] candidates, int target, int i,
                      List<Integer> list, List<List<Integer>> ans,
                      int currsum) {
        if (currsum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (currsum > target) {
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }
            list.add(candidates[j]);
            solve(candidates, target, j + 1,
                  list, ans, currsum + candidates[j]);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0,
              new ArrayList<>(), ans, 0);
        return ans;
    }
}