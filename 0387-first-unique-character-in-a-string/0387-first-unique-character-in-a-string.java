class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer>map=new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int index=0;
        for(char c:s.toCharArray()){
            if(map.get(c)==1){
                return index;
            }
            index++;
        }
    return -1;
    }
}