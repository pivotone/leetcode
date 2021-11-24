// 找到独有的字母，然后再根据已知的数据相减得到结果

class Solution {
    public String originalDigits(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int[] nums = new int[10];
        nums[0] = map.getOrDefault('z', 0);
        nums[2] = map.getOrDefault('w', 0);
        nums[4] = map.getOrDefault('u', 0);
        nums[6] = map.getOrDefault('x', 0);
        nums[8] = map.getOrDefault('g', 0);
        nums[1] = map.getOrDefault('o', 0) - nums[0] - nums[4] - nums[2];
        nums[3] = map.getOrDefault('h', 0) - nums[8];
        nums[7] = map.getOrDefault('s', 0) - nums[6];
        nums[5] = map.getOrDefault('v', 0) - nums[7];
        nums[9] = map.getOrDefault('i', 0) - nums[5] - nums[6] - nums[8];

        StringBuilder result = new StringBuilder("");
        for(int i = 0; i < 10; ++i){
            for(int j = 0; j < nums[i]; ++j)
                result.append(i);
        }

        return result.toString();
    }
}
