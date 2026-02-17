class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                ans[k++]=nums1[i++];
            }else{
                ans[k++]=nums2[j++];
            }
        }

        while(i<nums1.length){
            ans[k++]=nums1[i++];
        }

        while(j<nums2.length){
            ans[k++]=nums2[j++];
        }

        double result=0.0;
        if(ans.length%2!=0){
            result=ans[ans.length/2];
        }else{
            int index=ans.length/2;
           

            result=(double)(ans[index-1] + ans[index])/2;
        }
        return result;
    }
}
