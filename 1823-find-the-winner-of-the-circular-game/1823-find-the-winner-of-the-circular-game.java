class Solution {
    public int findTheWinner(int n, int k) {
       
    ArrayList<Integer> winners = new ArrayList<Integer>();
    for(int i=1;i<=n;i++)
        winners.add(i);
        
    return findWinners(winners , 0,k);
    }
    
    int findWinners(ArrayList<Integer> winners ,int i ,int k){
        
        if(winners.size()==1)
            return winners.get(0);
        
        i = (i+k-1)% winners.size();
        winners.remove(i);
        return findWinners(winners, i,k);
    }
}