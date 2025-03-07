class Solution {
    public int[] closestPrimes(int left, int right) {
        
        boolean[] prime = sieve(right+1);

        List<Integer> primeNums = new ArrayList<>();

        for(int i =left; i<=right ;i++){
            if(prime[i]){
                primeNums.add(i);
            }
        }

        if(primeNums.size() < 2)
            return new int[]{-1,-1};

        int minDiff =Integer.MAX_VALUE;
        int min=-1 , max=-1;

        for(int i =1; i<primeNums.size();i++ ){

            if( primeNums.get(i) - primeNums.get(i-1) < minDiff){
                min= primeNums.get(i-1);
                max= primeNums.get(i);
                minDiff = primeNums.get(i) - primeNums.get(i-1);
            }
        }
        return new int[]{min,max};
    }

    public boolean[] sieve(int n){

        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);

        prime[0] = prime[1] = false;

        for(int i = 2; i*i < n ;i++){

            if(prime[i]){

                for(int j = i*i ;j < n ; j+=i){
                    prime[j]=false;
                }
            }
        }
        return prime;
    }
 }