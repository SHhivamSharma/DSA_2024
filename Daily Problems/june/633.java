//633. Sum of Square Numbers


class Solution {
    public boolean judgeSquareSum(int c) {
        long s = 0 ;
        long e =  (long)Math.sqrt(c);
        while( s<= e){
            long sqr = (s * s) + (e * e);
            if(c == sqr){
                return true;
            }else if( sqr > c){
                e--;
            }else{
                s++;
            }

        }
        return false;
    }
}


//Solution 2
class Solution {
    public boolean judgeSquareSum(int c) {
        for (int divisor = 2; divisor * divisor <= c; divisor++) {
            if (c % divisor == 0) {
                int exponentCount = 0;
                while (c % divisor == 0) {
                    exponentCount++;
                    c /= divisor;
                }
                if (divisor % 4 == 3 && exponentCount % 2 != 0) {
                    return false;
                }
            }
        }
        return c % 4 != 3;
    }
}