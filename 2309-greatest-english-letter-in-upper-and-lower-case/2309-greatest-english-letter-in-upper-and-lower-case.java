class Solution {
    public String greatestLetter(String s) {
        
        char greatest='\0';
        
        HashSet<Character> characters = new HashSet<Character>();
        
        for(int i=0;i<s.length();i++){
            
            char cur =s.charAt(i);
            
            if(Character.isUpperCase(cur)){
                char temp=Character.toLowerCase(cur);
                if(characters.contains(temp)){
                    greatest = greatest > cur ? greatest : cur; 
                }
            }
            else{
                char temp=Character.toUpperCase(cur);
                if(characters.contains(temp)){
                    greatest = greatest > temp ? greatest : temp; 
                }
            }
            characters.add(cur);
            //System.out.println(characters);
        }
        if(greatest=='\0')
            return "";
        return greatest+"";
    }
}