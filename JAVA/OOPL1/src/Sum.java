public class Sum {
    public int sum(int x,int y){
        return (x+y);
    }
    public int sum(int x,int y,int z){
        return (x+y+z);
    }
    public double sum(double x, double y){
        return (x+y);
    }
    public static void main(String[] args) {
        Sum s=new Sum();
        int ans=s.sum(3,7);
//        System.out.println(ans);
        int ans2 =s.sum(2,3,4);
//        System.out.println(ans2);
        double ans3=s.sum(2.3,3);
//        System.out.println(ans3);


//        Students s1=new Students();
//        s1.details("sahil",67);
//        OverLoading o=new OverLoading();
//        o.sum(2, 3);
    }
    // overloaded sum()

}



class Students{
    public void details(String name, int roll){
        System.out.println("Student details:"+"name:"+" "+name+" "+"roll no:"+" "+roll);
    }
}
class MainClass{
    void sum(int a,long b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
class OverLoading{
    void sum(int a,long b){
        System.out.println("a metthod invoked");

    }
    void sum(long a,int b){
        System.out.println("b method invoked");
    }
}
