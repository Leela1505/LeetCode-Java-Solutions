class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder sb=new StringBuilder();
        int a=haystack.length();
        int b=needle.length();
        if(b>a){
            return -1;
        }
        for(int i=0;i<b;i++){
            sb.append(haystack.charAt(i));
        }
        if(sb.toString().equals(needle)){
            return 0;
        }
        for(int i=b;i<a;i++){
            sb.deleteCharAt(0);
            sb.append(haystack.charAt(i));
            if(sb.toString().equals(needle)){
               return i-b+1;
            }
        }
        return -1;
        
    }
}