class Solution{
    static int countFactors(int N) {
        int ans = 0 ;
        for(int i = 1 ; i <= Math.sqrt(N); i++){
            if( N%i == 0){
                if( i == Math.sqrt(N)){
                    ans+=1;
                }else{
                    ans+=2;
                }
            }
        }
        return ans ;
    }
}