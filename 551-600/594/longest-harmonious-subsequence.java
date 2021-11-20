class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i) map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int res = 0;
            int x = entry.getKey();
            if(!map.containsKey(x - 1) && !map.containsKey(x + 1)) continue;
            res = entry.getValue() + Math.max(map.getOrDefault(x - 1, 0), map.getOrDefault(x + 1, 0));
            result = Math.max(res, result);
        }

        return result;
    }
}
