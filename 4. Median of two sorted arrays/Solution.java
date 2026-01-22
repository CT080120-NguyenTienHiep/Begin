class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int med;
        int a = 0;
        int b = 0;
        int i = 0;
        int arr[] = new int[nums1.length + nums2.length];
        while(a != nums1.length && b != nums2.length)
        {
            if(nums1[a] < nums2[b])
            {
                arr[i] = nums1[a];
                a++;
                i++;
            }
            else
            {
                arr[i] = nums2[b];
                b++;
                i++;
            }
        }
        if(a == nums1.length)
        {
            while(b != nums2.length)
            {
                arr[i] = nums2[b];
                b++;
                i++;
            }
        }
        else
        {
            while(a != nums1.length)
            {
                arr[i] = nums1[a];
                a++;
                i++;
            }
        }
        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
}
