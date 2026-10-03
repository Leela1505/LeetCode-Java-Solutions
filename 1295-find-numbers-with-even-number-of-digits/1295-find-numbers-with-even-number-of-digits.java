class Solution {
    public int findNumbers(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int c=0;
            while(n>0){
                int m=n%10;
                c++;
                n=n/10;
            }
            if(c%2==0){
                a++;
            }
        }
        return a;
        
    }
}