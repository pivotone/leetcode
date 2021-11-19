// 使用HashMap 达到搜索为常数级的复杂度
// 使用HashMap 也可以对多组进行O(n)级的查询

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; ++i) {
            if(map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = (int)map.get(nums[i]);
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
