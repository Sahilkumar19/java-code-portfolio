interface inf1{
    void show();
}
class concreate1 implements inf1{
    public void show(){
        System.out.println("hello");
    }
}
public class LambdaExpr {
    public static void main(String[] args) {
        parameter a1=(r,p)->(p*(r*r));
        System.out.println(a1.Show(10,3.14));
    }
}
@FunctionalInterface
interface parameter{
    double Show(int r, double p);
}

