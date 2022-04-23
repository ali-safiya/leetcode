public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<String,String> urlMapping = new HashMap<>();
    int num=0;
    public String encode(String longUrl) {
        num++;
      
        String addOn=String.valueOf(num);
        String shortUrl= "http://tinyurl.com/" +  addOn;
        
        urlMapping.put(shortUrl,longUrl);
        return shortUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urlMapping.get(shortUrl);
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));