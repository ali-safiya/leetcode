class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String>  set = new HashSet<>();
        
        for(int i=0; i < emails.length; i++){
            
            String[] s = emails[i].split("@");
            
            String name = s[0];
            String domain =s[1];
            
            int index = name.indexOf('+');
            String k=name;
            if(index>=0)
            k = name.substring(0,index);;
            
            k= k.replaceAll("\\.","");

            set.add(k+"@"+domain);
            // System.out.println(set);
            
        }
        
        return set.size();
    }
}