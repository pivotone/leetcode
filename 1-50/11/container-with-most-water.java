// 两边向中间搜索

class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int result = 0;
        int i = 0, j = len - 1;
        while(i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            if(height[i] > height[j]) j--;
            else i++;
            result = Math.max(result, area);
        }

        return result;
    }
}
