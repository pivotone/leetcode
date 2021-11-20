// 简单的滑动窗口


class Solution {
    public int minSwaps(int[] data) {
        int len = data.length;
        int nums_x = 0;
        for(int num : data)
            nums_x += num;
        
        int nums_1 = 0;
        int result = 0;
        for(int i = 0; i < nums_x; ++i) {
            if(data[i] == 1) nums_1++;
        }
        result = Math.max(result, nums_1);
        for(int i = nums_x; i < len; ++i) {
            if(data[i - nums_x] == 1) nums_1--;
            if(data[i] == 1) nums_1++;
            result = Math.max(result, nums_1);
        }

        return nums_x - result;
    }
}
