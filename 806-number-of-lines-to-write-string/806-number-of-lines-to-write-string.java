class Solution {
    public int[] numberOfLines(int[] widths, String s) {
      int[] res =new int[2];
        int count=0;
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if((sum + widths[((int)s.charAt(i))%97])<=100)
            {
            sum+=widths[((int)s.charAt(i))%97];
                
            }
            else
            {
                count++;
                sum=widths[((int)s.charAt(i))%97];

            }
        }
        res[0]=++count;
        res[1]=sum;
        return res;
    }
}