// 当当前最大值小于之后最小值时，结果加1，如果不满足这种情况但是此时已经是数组末尾，结果加1。

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[] maxNumber = new int[arr.length];
        int[] minNumber = new int[arr.length];
        maxNumber[0] = arr[0];
        minNumber[arr.length - 1] = arr[arr.length - 1];
        for(int i = 1; i < arr.length; ++i) {
            maxNumber[i] = Math.max(maxNumber[i - 1], arr[i]);
        }
        for(int i = arr.length - 2; i >= 0; --i) {
            minNumber[i] = Math.min(minNumber[i + 1], arr[i + 1]);
        }
        int res = 0;
        for(int i = 0; i < arr.length; ++i) {
            // System.out.println(maxNumber[i] + " " + minNumber[i]);
            if((maxNumber[i] <= minNumber[i]) || i == arr.length - 1)
                res++;
        }
        return res;
    }
}
