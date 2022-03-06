/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int x=rand7();
        int y =rand7();
        int v=(x-1)*7 + y;
        
        if(v>=41)
            return rand10();
        return ((v)%10)+1;
    }
}