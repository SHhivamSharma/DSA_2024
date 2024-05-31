import java.util.*;
public class Pattern1 {
 

   /* for n = 5 
    *****
    *****
    *****
    *****
    *****
    */

    public static void Pattern01(int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    // ------------------------------------------------------ ---------------------------


   /* for n = 5 
    *
    *       *
    *       *       *
    *       *       *       *
    *       *       *       *       *

    */

    public static void Pattern02(int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------ ---------------------------

    /* for n = 5 
    *       *       *       *       *
    *       *       *       *
    *       *       *
    *       *
    *
    */

    public static void Pattern03(int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n-i ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    // for n = 5 By revesing the loop 

    public static void Pattern03_1(int n){
        for(int i = n ; i>=1 ; i--){
            for(int j = i ; j>=1 ; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------ ---------------------------

    /* for n = 5 
    1
    1       2
    1       2       3
    1       2       3       4
    1       2       3       4       5
    */

    public static void Pattern04(int n){
        int Number = 1;

        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<=i ;j++){
                System.out.print(Number+"\t");
                Number++;
            }
            System.out.println();
            Number = 1;
        }


    }
// by indexes of the loop 
    public static void Pattern04_1(int n){
        for(int i = 1 ; i<=n; i++){
            for(int j = 1 ; j<=i ;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

    }

    // ------------------------------------------------------ ---------------------------

    
    /* for n = 5 
    1
    2       2
    3       3       3
    4       4       4       4
    5       5       5       5       5
    */

    public static void Pattern05(int n){
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
    // ------------------------------------------------------ ---------------------------

    /* for n = 5 
    1       2       3       4       5
    1       2       3       4
    1       2       3
    1       2
    1
    */

    public static void Pattern06(int n){
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=n-i+1 ; j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

    /* for n = 5 
                                        *
                                *       *       *
                        *       *       *       *       *
                *       *       *       *       *       *       *
        *       *       *       *       *       *       *       *       *
    */


    public static void Pattern07(int n){
        for(int i = 0 ; i < n ; i++){
            int nsp = n-i-1;
            int nst = 2*i +1;
            for(int j = 0 ; j < nsp ; j++){
                System.out.print("\t");
            }
            for(int j = 0 ; j < nst ; j++){
                System.out.print("*\t");
            }

            for(int j = 0 ; j < nsp ; j++){
                System.out.print("\t");
            }
            System.out.println();
        }
    }



     /* for n = 5 // by revering the loop
        *       *       *       *       *       *       *       *       *
                *       *       *       *       *       *       *
                        *       *       *       *       *
                                *       *       *
                                        *
    */


    public static void Pattern08(int n){
        for(int i = n-1 ; i >= 0 ; i--){
            int nsp = n-i-1;
            int nst = 2*i +1;
            for(int j = 0 ; j < nsp ; j++){
                System.out.print("\t");
            }
            for(int j = 0 ; j < nst ; j++){
                System.out.print("*\t");
            }

            for(int j = 0 ; j < nsp ; j++){
                System.out.print("\t");
            }
            System.out.println();
        }
    }


    public static void Pattern08_1(int n){
        for(int i = 0 ; i < n ; i++){
            int nsp = i;
            int nst = 2*n- (2*i+1);

            //Inner loop for space
            for(int j = 0 ; j < nsp ; j++){
                System.out.print("\t");
            }

           //Inner loop for Start
            for(int j = 0 ; j < nst ; j++){
                System.out.print("*\t");
            }

            //Inner loop for space
            for(int j = 0 ; j < nsp ; j++){
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    /* for n = 5 
                                        *
                                *       *       *
                        *       *       *       *       *
                *       *       *       *       *       *       *
        *       *       *       *       *       *       *       *       *
        *       *       *       *       *       *       *       *       *
                *       *       *       *       *       *       *
                        *       *       *       *       *
                                *       *       *
                                        *
    */
    public static void Pattern09(int n){

            for(int i = 0 ; i < (2*n) ; i++){
            int nsp = 0;
            int nst = 0;
            if(i < n){
                nsp = n - i -1 ;
                nst = 2*i+1;
            }else{
                nsp = i-n;
                nst = (2*n)-1-2*(i-n) ;
            }

            //Inner loop for space
            for(int j = 0 ; j < nsp ; j++){
                System.out.print("\t");
            }

           //Inner loop for Start
            for(int j = 0 ; j < nst ; j++){
                System.out.print("*\t");
            }

            //Inner loop for space
            for(int j = 0 ; j < nsp ; j++){
                System.out.print("\t");
            }
            System.out.println();
        }
    }


    /* for n = 5 

    *
    *       *
    *       *       *
    *       *       *       *
    *       *       *       *       *
    *       *       *       *
    *       *       *
    *       *
    *

    */

    public static void Pattern10(int n){
        int nst = 1 ;
        for(int i = 0 ; i < (2*n)-1 ; i++){
            int t = ((i+1)/n);
            for (int j = 0 ; j < nst ; j++){
                System.out.print("*\t" );
            }
            if ( t == 0){
                nst++;
            }else{
                nst--;
            }
            System.out.println();
        }
    }



    /* for n = 5 
        1
        0       1
        1       0       1
        0       1       0       1
        1       0       1       0       1
  
    */

    public static void Pattern11(int n){
        int c = 0;
        for(int i = 0 ; i<n ; i++){
            if(i%2 == 0){
                c = 1;
            }else{
                c = 0;
            }
            for(int j = 0 ; j<=i ; j++){
                System.out.print(c +"\t");
                c =  c == 1 ? 0 : 1;
                // c = 1-c; // the if condition can be written as this 
            }
            
            System.out.println();
        }
    }

        /* for n = 5 

        1        1
        12      21
        123    321
        1234  4321
        1234554321

        */


    public static void Pattern12(int n){
        
        for(int i = 0 ; i<n ; i++){
            int nst = i+1;
            int nsp = 2*(n-i-1);
            for(int j = 0 ; j< nst ; j++){
                int temp = j+1;
                System.out.print(temp);
            }

            for(int j = 0 ; j< nsp ; j++){
                System.out.print(" ");
            }

            int temp2 = nst;
            for(int j = 0 ; j< nst ; j++){
                System.out.print(temp2);
                temp2--;
            }
            System.out.println();
        }
    }


    public static void Pattern12_1(int n){
        int nsp = 2*(n-1);

        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(j);
            }

            for(int j = 0 ; j< nsp ; j++){
                System.out.print(" ");
            }

            for(int j = i ; j> 0 ; j--){
                System.out.print(j);
            }
            System.out.println();
            nsp -=2;
        }
    }



        /* for n = 5 

        1
        2       3
        4       5       6
        7       8       9       10
        11      12      13      14      15

        */
    

    public static void Pattern13(int n ){
        int num = 1;
        for(int i = 0  ; i <n ; i++){
            for(int j = 0  ; j<=i ; j++){
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }

    }


       /* for n = 5 
        A
        A       B
        A       B       C
        A       B       C       D
        A       B       C       D       E
        */

    public static void Pattern14(int n ){
        for(int i = 0  ; i <n ; i++){
            for(char ch = 'A'  ; ch <= 'A' +i ; ch++){
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }

    /* for n = 5 
    A       B       C       D       E
    A       B       C       D
    A       B       C
    A       B
    A
    */

    public static void Pattern15(int n ){
        for(int i = n  ; i >0 ; i--){
            for(char ch = 'A'  ; ch < 'A' +i ; ch++){
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }

    /* for n = 5 
        A
        BB
        CCC
        DDDD
        EEEEE
    */

    public static void Pattern16(int n ){
        char ch = 'A';
        for(int i = 0  ; i <n ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    /* for n = 5 
                                    A
                            A       B       A
                    A       B       C       B       A
            A       B       C       D       C       B       A
    A       B       C       D       E       D       C       B       A
    */


    public static void Pattern17(int n ){
        for(int i = 1 ; i <= n ; i++){
            int nsp = n - i;
            int nst = 2*i -1;
            char ch = 'A';

            for(int j = 0 ; j<nsp ; j++){
                System.out.print("\t");
            }

            for(int j = 0 ; j<nst ; j++){
                System.out.print(ch+"\t");
                if(nsp+j+1 < n){
                    ch++;
                }else{
                    ch--;
                }
            }

            for(int j = 0 ; j<nsp ; j++){
                System.out.print("\t");
            }

            System.out.println();
        }
    }
    
    /* for n = 5 
        E
        DE
        CDE
        BCDE
        ABCDE
     */

    public static void Pattern18(int n ){

        for(int i = 0 ; i<n ; i++){
            char ch = 'A';

            for(int k = 0; k < n-1-i ;k++){
                ch++;
            }
            for(int j = 0 ; j <=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }


    /* for n = 5 
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********
     */

     public static void Pattern19(int n ){

        for(int i = 0 ; i< n; i++){
            for(int j = 0 ; j < n-i ; j++){
                System.out.print("*");
            }

            for(int j = 0 ; j < 2*i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < n-i ; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 1 ; i<= n; i++) {
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }

            for(int j = 0 ; j < (2*n) - (2*i) ; j++){
                System.out.print(" ");
            }

            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }


    /* for n = 5 
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****
        ***    ***
        **      **
        *        *
    */

    public static void Pattern20(int n ){
        int nst = 0 ;
        int nsp = (2*n) ;
        for(int i = 1 ; i< 2* n; i++){
            if(i > n){
                nsp +=2;
            }else{
                nsp -=2;
            }

            nst = ((2*n)- nsp)/2;
            for(int j = 0 ; j < nst ; j++){
                System.out.print("*");
            }

            for(int j = 0 ; j < nsp ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < nst ; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }



    /* for n = 5 
        *****
        *   *
        *   *
        *   *
        *****
    */
    public static void Pattern21(int n ){

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                if( i == 0 || j == 0 || i == (n-1 )|| j == (n-1) ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    /// Main function 
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");

        int n = scn.nextInt() ; 
        Pattern21(n);
    }




}
