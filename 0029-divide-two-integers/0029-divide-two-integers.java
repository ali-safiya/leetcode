class Solution {
    public int divide(int dividend, int divisor) {
        
         if (dividend == Integer.MIN_VALUE && divisor == -1)
             return Integer.MAX_VALUE; 
        
        boolean isNegative = dividend < 0 ^ divisor <0;
        
        dividend = Math.abs(dividend);
        divisor  = Math.abs(divisor);
        
        int quotient =0;
        int subquotient =0;
        
        
        while( dividend - divisor >=0 ){
            
            for( subquotient=0; dividend - (divisor << subquotient <<1 )>=0 ;subquotient++ );
                
                 //  System.out.println("quo "+ quotient + "div :" + dividend  );
                   quotient += 1 << subquotient ;
                   dividend -=  divisor << subquotient;
            
        
        }
        
        return isNegative ? -quotient : quotient;
        
    }
}