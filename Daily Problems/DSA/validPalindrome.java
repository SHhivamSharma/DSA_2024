class Solution {
    public boolean validPalindrome(String s) {
        
        int start = 0;
        int end = s.length() -1 ;
        boolean count = true;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                //Because we havr to add Skip only one emepment
               return ispalin(s, start+1 , end) || ispalin(s, start , end-1);
            }
        }
        return true;
    }

    public boolean ispalin(String s , int start , int end){
         while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
         }
        return true;
    }

}