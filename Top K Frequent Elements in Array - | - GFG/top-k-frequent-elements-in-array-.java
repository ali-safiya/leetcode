//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    class Pair{
            int a;
            int b;
            
            Pair(int a , int b){
                this.a=a;
                this.b=b;
            }
            Pair(){
                this.a=a;
                this.b=b;
            }
        }
    public int[] topK(int[] nums, int k) {
        
        
        // Code here
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int j=0; j< nums.length ;j++){
            freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);
            // System.out.println(j+" "+ nums[j]);
        }
        // System.out.println(freq);
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) ->
          x.b == y.b ? y.a - x.a :    y.b- x.b );
        
        
        for(Map.Entry<Integer,Integer>  entry : freq.entrySet()){
                pq.add(new Pair(entry.getKey(),entry.getValue()));
                Pair p = new Pair(entry.getKey(),entry.getValue());
// System.out.println(p.a);
        }
        int[] ans = new int[k];

        for( int i=0; i<k ;i++){
            Pair p = new Pair();
            p=pq.poll();
            ans[i]= p.a;
        }
        return ans;
        
    }
}