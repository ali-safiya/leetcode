class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        
        HashMap<String,List<String>> files = new HashMap<>();
        List<List<String>> res = new ArrayList<List<String>>();
    
        for(String path : paths){
            
            String[] val = path.split(" ");
            
            for(int i=1;i <val.length;i++){
                
                String[] file = val[i].split("\\(");
                
                String fileContent = file[1].replace(")","");
                
                List<String> list = files.getOrDefault(fileContent ,new ArrayList<String>());
                
                list.add( val[0]+ "/"+ file[0]);
                
                files.put(fileContent , list);
            }
            
        }
        
        for(String key : files.keySet()){
            
            
          if((files.get(key).size())>1)
            res.add(files.get(key));
        }
        
       return res; 
        
    }
}