import java.util.*;
public class Pattern1 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");

        int n = scn.nextInt() ; 
        Pattern01(n);
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
}
