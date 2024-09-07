class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int left = 0 ;
        int right = s.length()-1;
        while(left <= right){
            char lc = Character.toLowerCase(s.charAt(left)) ;
            char rc =  Character.toLowerCase(s.charAt(right)) ; 
            if(!Character.isLetterOrDigit(lc)){
                left++;
            }else if(!Character.isLetterOrDigit(rc)){
                right--;
            }else{
                if(lc != rc){
                    return false;
                }
                right--;
                left++;
            }
        }
        return true;
    }
}