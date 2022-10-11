class Solution {
public:
    bool checkDistances(string str, vector<int>& dis) {
        unordered_map<char, int> un;
        int k=str.length();
        for(int a=0;a<k;a++){
            if(un.find(str[a])!=un.end()){
                int m=a-un[str[a]]-1;
                int mn=dis[str[a]-97];
                if(m!=mn){
                    return false;
                }
            }
            un[str[a]]=a;
        }
        return true;
        
    }
};
