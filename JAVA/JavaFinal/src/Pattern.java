/*
    1
   121
  12321
 1234321
123454321

print the pattern
 */
public class Pattern {
    public static void main(String[] args) {
//        pat10000(9);
//        pat1(4);
//        pat2(5);
//        pat3(5);
//        pat4(5);
//        pat5(5);
//        pat28(5);
//        pat0(5);
//        pat87(5);
//        pat88(5);
//        pat45("university");
//        String s = "university";
//        int len=s.length();
//        int i=0;
//        int c=1;
//        while(len>0){
//            for(int j=1;j<=c;j++){
//                System.out.print(s.charAt(i));
//                len--;
//                i++;
//            }
//            c++;
//            System.out.println();
//        }

//        int x,j,k;
//        for (int i=1;i<=5;i++){
//            for(x=1;x<=i;x++){
//                System.out.print(x);
//            }
//            for(j=1;j<x;j++){
//                System.out.print(x-1);
//            }
//            for(k=x-2;k>=1;k--){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
    }
    public static void pat0(int n){
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            for (int col = row-1; col >0 ; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    
    
    public static void pat2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <n ; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void pat1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <=row ; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void pat3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pat4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
    public static void pat5(int n){
        for (int row = 0; row < n*2; row++) {
            int totalcolinrow=row>n? 2*n-row:row;
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pat28(int n){
        for (int row = 0; row < n*2; row++) {
            int totalcolinrow=row>n? 2*n-row:row;
            int totalspaces=n-totalcolinrow;
            for (int s = 0; s < totalspaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pat30(int n){
        for (int row = 1; row <=n ; row++) {
            for (int s = 0; s < n-row; s++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void pat90(int n){
        for (int row = 1; row <=n ; row++) {
            for (int s = 0; s < n-row; s++) {
                System.out.print(" ");

            }
            for (int i = 1; i <=row ; i++) {
                System.out.print(i);
            }
            for (int j = row-1; j >0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pat87(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
    public static void pat88(int n){
        for (int row = 1; row <=n ; row++) {
            for (int i = 1; i <=row ; i++) {
                System.out.print(i);
            }
            for (int j = 1; j <row ; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void pat10000(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (i<=Math.sqrt(n)){
                for (int j = i; j <2*i ; j++) {
                    System.out.print(j);
                }
            }else {

            }
        }
    }
}
