class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set=new HashSet<>();
        int c=0;
        int m=0;
        char [] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            set.clear();
            for(int j=i;j<ch.length;j++){
                if(set.contains(ch[j])){
                    break;
                }
                set.add(ch[j]);
                m=Math.max(m,set.size());
            }
        }
        
        return m;
        
    }
}