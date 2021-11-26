class Solution {
    public void nextPermutation(int[] nums) {
        for(int i = nums.length - 1; i > 0; --i) {
            if(nums[i - 1] < nums[i]) {
                for(int j = i; j < nums.length; ++j) {
                    for(int k = j + 1; k < nums.length; ++k) {
                        if(nums[j] > nums[k]) {
                            int temp = nums[j];
                            nums[j] = nums[k];
                            nums[k] = temp;
                        }
                    }
                }
                for(int j = i; j < nums.length; ++j) {
                    if(nums[j] > nums[i - 1]) {
                        int temp = nums[i - 1];
                        nums[i - 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
                return;
            }
        }
        for(int i = 0; i < nums.length / 2; ++i) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }
}

// 关于对字典序的理解，题目好像并不是组合为一个大数的字典序排序

/*class Solution {
    public void nextPermutation(int[] nums) {
        for(int i = nums.length - 1; i > 0; --i) {
            if(compare(nums[i - 1], nums[i])) {
                int pos = nums.length - 1;
                int min_nums = nums[pos];
                for(int j = nums.length - 2; j >= i; --j) {
                    if(!compare(min_nums, nums[j])) {
                        pos = j;
                        min_nums = nums[j];
                    }
                }
                nums[pos] = nums[i - 1];
                nums[i - 1] = min_nums;
                return;
            }
        }
        for(int i = 0; i < nums.length / 2; ++i) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }

    private boolean compare(int x, int y) {
        String x_y = x + "" + y;
        String y_x = y + "" + x;
        return x_y.compareTo(y_x) < 0;
    }
}*/
