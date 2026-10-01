class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int temp=x;
        while(x>0){
            int m=x%10;
            sum=sum*10+m;
            x=x/10;

        }
        return sum==temp;
        
        
    }
}