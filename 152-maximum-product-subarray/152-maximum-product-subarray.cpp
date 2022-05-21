class Solution {
public:
    int maxProduct(vector<int>& arr) {
            int n=arr.size();                             
            int mx= INT_MIN,product = 1;
        for(int i=0;i<n;i++){
            product *=arr[i];
            mx = max(mx,product);
            
            product = product==0?1:product;
        }
        product = 1;
        for(int i=n-1;i>=0;i--){
            product *=arr[i];
            mx = max(mx,product);
            
            product = product==0?1:product;
        }
                            
        return mx; 
    }
};