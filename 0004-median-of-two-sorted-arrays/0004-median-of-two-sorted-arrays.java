class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n=nums1.length;   
      int m=nums2.length;  
      int arr[]=new int[n+m];
      int j=0;
      for(int i=0;i<n;i++)
      {
        arr[j++]=nums1[i];
      } 
      for(int i=0;i<m;i++)
      {
        arr[j++]=nums2[i];
      } 
    //   int ans[]=new int[arr.length];
    //   for(int i=0;i<arr.length;i++)
    //   {
    //     ans[i]=arr[i];
    //   }
      Arrays.sort(arr);
      int mid=arr.length/2;
      if(arr.length%2==0)
      {
        return (double)(arr[mid-1]+arr[mid])/2;
      }
      else
      {
        return (double)(arr[mid]);
      }
    }
}