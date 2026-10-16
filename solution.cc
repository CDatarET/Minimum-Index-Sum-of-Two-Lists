class Solution {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        unordered_map<string, int> map;
        for(int i = 0; i < list1.size(); i++) map[list1[i]] = i;

        vector<string> v;
        int c = 2001;
        for(int i = 0; i < list2.size(); i++){
            if(map.contains(list2[i])){
                int x = map[list2[i]] + i;
                if(x == c) v.push_back(list2[i]);
                else if(x < c){
                    v.clear();
                    v.push_back(list2[i]);
                    c = x;
                }
            }
        }

        return v;
    }
};
