import java.util.*;
public class Pattern1 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");

        int n = scn.nextInt() ; 
        // Pattern01(n);
        // Pattern02(n);
        // Pattern03(n);
        // Pattern03_1(n);
        // Pattern04(n);
        // Pattern04_1(n);
        Pattern07(n);


    }


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



}
