import java.util.ArrayList;

public class MultPrimeInRange {
    public static void main(String[] args) {
        int ans=findmult(1,10);
        System.out.println(ans);
    }
    public static int findmult(int l,int u){
        int f=0;
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = l; i <=u ; i++) {
            for (int j = 1; j <=i; j++) {
                if (i%j==0){
                    f++;
                }
            }
            if (f==2){
                al.add(i);
            }
            f=0;
        }
        System.out.println("Loweast prime:"+ " "+al.get(0)+" "+"Highest is:"+" "+al.get(al.size()-1));
        return al.get(0)*al.get(al.size()-1);
    }
}
