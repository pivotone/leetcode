// 二分法求中位数
// 不管奇偶，都求两个中位数，相加除以二就是结果

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (findKth(nums1, 0, nums2, 0, l) + findKth(nums1, 0, nums2, 0, r)) / 2.0;
    }
    // 求两个数组中的第K大的数据
    public int findKth(int nums1[], int i, int nums2[], int j, int k) {
        if(i >= nums1.length) return nums2[j + k - 1];
        if(j >= nums2.length) return nums1[i + k - 1];
        if(k == 1) return Math.min(nums1[i], nums2[j]);
        int mid1 = (i + k / 2 - 1 < nums1.length) ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
        int mid2 = (j + k / 2 - 1 < nums2.length) ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;
        if(mid1 < mid2) return findKth(nums1, i + k / 2, nums2, j, k - k / 2);
        else return findKth(nums1, i, nums2, j + k / 2, k - k / 2);
    } 
}
