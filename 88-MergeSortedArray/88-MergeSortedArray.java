// Last updated: 13/01/2026, 15:06:20
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3
4        int i=m-1;
5        int j =n-1;
6        int k = nums1.length-1;
7
8        while(j>=0 && i>=0){
9
10            if(nums1[i]< nums2[j]){
11                nums1[k--]=nums2[j--];
12            }
13            else{
14                nums1[k--]=nums1[i--];
15            }
16
17        }
18
19        while(j>=0){
20            nums1[k--]=nums2[j--];
21        }
22        
23        
24    }
25}