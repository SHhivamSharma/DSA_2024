class Solution {
    static String armstrongNumber(int n) {
        // code here
        int number = n ; 
        int result = 0;
        
        while(number >0){
            int num = number%10;
            int temp = num*num*num;
            result+=temp;
            number = number/10;

        }
        
        if(result == n){
            return "true";
        }
        return "false";
    }
}