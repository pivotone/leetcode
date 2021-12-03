// nums[i]的值较小，所以使用一个200的数组来记录数据
// 在小于0的区间内取反，若操作完成后k不为0则找最小的数
// f[200 - pos] = (k % 2 == 0) ? 0 : 1;
// f[pos] = (k % 2 == 0) ? f[pos] : f[pos] - 1;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int[] f = new int[201];
        for(int i = 0; i < nums.length; ++i) 
            f[100 + nums[i]]++;
        for(int i = 0; i < 100; ++i)
            while(f[i] != 0 && k > 0) {
                f[200 - i]++;
                f[i]--;
                k--;
            }
        if(k > 0) {
            int pos = 100;
            for(int i = 100; i < 201; ++i) 
                if(f[i] != 0) {
                    pos = i;
                    break;
                }  
            f[200 - pos] = (k % 2 == 0) ? 0 : 1;
            f[pos] = (k % 2 == 0) ? f[pos] : f[pos] - 1;
        }
        int sum = 0;
        for(int i = 0; i < 201; ++i)
            sum += (f[i] * (i - 100));
        
        return sum;
    }
}
