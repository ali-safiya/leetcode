class Solution {
    public int maxArea(int[] height) {
      int i=0;
      int j=height.length-1;
      int maxarea=0;
      while(i<j){
          maxarea= Math.max(maxarea, (j-i)*Math.min(height[i],height[j]));
          
          if(height[i]<height[j])
              i=i+1;
          else
              j=j-1;
          
      }
        return maxarea;
    }
}