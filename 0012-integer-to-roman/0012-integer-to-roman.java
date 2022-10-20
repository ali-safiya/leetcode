class Solution {
    public String intToRoman(int num) {
        
        String[] thous = new String[]{"" ,"M" , "MM","MMM" };
        String[] hund = new String[]{"", "C","CC","CCC", "CD", "D","DC", "DCC","DCCC", "CM"};
        String[] ten = new String[]{"", "X", "XX","XXX", "XL","L","LX","LXX","LXXX","XC"};
        String[] one = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        StringBuilder ans = new StringBuilder();
         
       
        ans.append(thous[num/1000]);
        ans.append(hund[(num%1000)/100]);
        ans.append(ten[(num%100)/10]);
        ans.append(one[(num%10)]);
        
        return ans.toString();
        
    }
}