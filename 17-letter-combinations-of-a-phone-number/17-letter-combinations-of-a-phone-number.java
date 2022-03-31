class Solution {
    
    String[] keys ={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public List<String> letterCombinations(String digits) {
        
        List<String> result =new ArrayList<String>();
        if(digits.length()==0)
            return result;
        
        return solve(result,digits,0,"");
        
    }
    
    List<String> solve(List<String> result,String digits,int index,String t){
        
        if(index==digits.length()){
            
            result.add(t);
            return result;
        }
        int temp=keys[Character.getNumericValue(digits.charAt(index))-2].length()-1;
        while(temp>=0){
            String tt=t+keys[Character.getNumericValue(digits.charAt(index))-2].charAt(temp);
            solve(result,digits,index+1,tt);
            temp--;
            System.out.println(tt);
        }
        
        return result;
    }
}