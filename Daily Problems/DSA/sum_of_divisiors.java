// Runtime Error 
// Test Cases Passed: 
// 1012 /1115
// Time Limit Exceeded

// Your program took more time than expected.Expected Time Limit : 1sec
// Hint : Please optimize your code and submit again.



static long sumOfDivisors(int N){

    // code here
    
    long ans = 0;
    for(int i = 1 ; i<= N ;i++){
        ans+=getMulti(i);
    }
    
    return ans;
    
}
private static int getMulti(int N){
    int ans = 0;

    for(int n = 1 ; n<= Math.sqrt(N) ; n++){
        if(N%n == 0){
           int q = N/n;
           if(q!= n){
               ans = ans + n + q;
           }else{
                 ans = ans + q;
           }
        }
    }

    return ans;
}