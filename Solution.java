class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }

        ArrayList<String> list = new ArrayList<>();
        int c = 2001;
        for(int i = 0; i < list2.length; i++){
            if(map.get(list2[i]) != null){
                int x = map.get(list2[i]) + i;
                if(x == c){
                    list.add(list2[i]);
                }
                else if(x < c){
                    list.clear();
                    list.add(list2[i]);
                    c = x;
                }
            }
        }

        String[] ret = list.toArray(new String[0]);
        return ret;
    }
}
