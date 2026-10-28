class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[]resultant=new int[n+m];
        for(int i=0;i<n;i++){
            resultant[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            resultant[n+i]=nums2[i];
        }
        Arrays.sort(resultant);
        double median=0;
        int start=0;
        int end=resultant.length-1;
        int mid=start+(end-start)/2;
        if(resultant.length%2==0){
                median=(resultant[mid]+resultant[mid+1])/2.0;
            }
        else{
                median=resultant[mid];
            }
    return median;
    }
}