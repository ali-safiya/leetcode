class Solution {
    public List<String> buildArray(int[] target, int n) {
       ArrayList<String> stack_operations = new ArrayList<String>();
        int j=0;
        for(int i=1;i<=n;i++)
        {
            if(target[j]==i)
            {
                stack_operations.add("Push");
                j++;
            }
            else
            {
                stack_operations.add("Push");
                stack_operations.add("Pop");
            }
            if(j==target.length)
                break;
        }
        return stack_operations; 
    }
}