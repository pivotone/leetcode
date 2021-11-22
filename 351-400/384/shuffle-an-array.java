// 经典洗牌算法

class Solution {
    int[] array;
    int[] original;

    public Solution(int[] nums) {
        array = nums;
        original = array.clone();
    }
    
    public int[] reset() {
        array = original;
        original = original.clone();
        return array;
    }
    
    public int[] shuffle() {
        for(int i = array.length - 1; i > 0; --i) {
            int temp = array[i];
            int random = new Random().nextInt(i + 1);
            array[i] = array[random];
            array[random] = temp;
        }

        return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
