class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> transformedWords = new HashSet<String>();
        
        for(String word : words ){
            String morseCode="";
            for(int i =0;i<word.length();i++ ){
                morseCode+=morse[word.charAt(i)-'a'];
            }
            transformedWords.add(morseCode);
        }
        
        return transformedWords.size();
    }
}