// 只记录最先出现的位置， 当sum == k 时， result = i + 1；
// 当sum - k 在map中可以找到时， 用当前的position - map的value；

class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, result = 0;
        for(int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            map.putIfAbsent(sum, i);
            if(sum == k) result = i + 1;
            if(map.containsKey(sum - k)) {
                result = Math.max(i - map.get(sum - k), result);
            }
        }

        return result;
    }
}

// 画蛇添足，可以简略

// class Solution {
//     public int maxSubArrayLen(int[] nums, int k) {
//         Map<Integer, ArrayList<Integer>> map = new HashMap<>();
//         int sum = 0, result = 0;
//         for(int i = 0; i < nums.length; ++i) {
//             sum += nums[i];
//             ArrayList<Integer> al = map.getOrDefault(sum, new ArrayList<>());
//             al.add(i);
//             map.put(sum, al);
//         }
//         for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
//             if(entry.getKey() - k == 0) {
//                 result = Math.max(result, entry.getValue().get(entry.getValue().size() - 1) + 1);
//                 continue;
//             }
//             if(!map.containsKey(entry.getKey() - k)) continue;
//             int r = entry.getValue().get(entry.getValue().size() - 1);
//             int l = map.get(entry.getKey() - k).get(0);
//             result = Math.max(result, r - l);
//         }

//         return result;
//     }
// }
