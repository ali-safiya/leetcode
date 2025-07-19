// Last updated: 19/07/2025, 22:00:04
class Solution {

    class TrieNode{
            boolean end;
            HashMap<String,TrieNode> next;

            TrieNode(){
                this.end = false;
                this.next = new HashMap<>();
            }
        }
    public List<String> removeSubfolders(String[] folder) {
        
        TrieNode root = new TrieNode();
        buildTrie(folder , root);
        List<String> result = new ArrayList<>();

        for(String path : folder){

            String[] folderNames= path.split("/");
            TrieNode currentNode = root;
            boolean isSubFolder = false;

            for(int i =0 ;i < folderNames.length;i++){

                if(folderNames[i].equals("")) continue;

                TrieNode nextNode = currentNode.next.get(folderNames[i]);

                if(nextNode.end && i!= folderNames.length-1){
                    isSubFolder = true;
                    break;
                }

                currentNode = nextNode;
            }

            if(!isSubFolder) result.add(path);

        }
        return result;
    }

    private void buildTrie(String[] folder, TrieNode root){

        for(String path: folder){

            String[] folderNames= path.split("/");
            TrieNode currentNode = root;

            for(String folderName : folderNames){

                if(folderName.equals("")) continue;

                if(!currentNode.next.containsKey(folderName)){
                    currentNode.next.put(folderName, new TrieNode());
                }

                currentNode = currentNode.next.get(folderName);
            }
            currentNode.end=true;
        }

    }
}