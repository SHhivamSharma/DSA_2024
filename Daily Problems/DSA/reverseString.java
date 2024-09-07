class Solution {
    public void reverseString(char[] s) {
        int left = 0 ; int right = s.length-1;
        while(left<= right){
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
            left++;
            right--;

        } 
       
    }
}



//REC
class Solution {
    public void reverseString(char[] s) {
        int left = 0 ; int right = s.length-1;
        Rev(s , left , right);
       
    }
    public void Rev(char[] s , int left , int right){
        if(left >= right){
            return;
        }
        char ch = s[left];
        s[left] = s[right];
        s[right] = ch;
        left++;
        right--;
        Rev(s , left , right);
    }
    
}