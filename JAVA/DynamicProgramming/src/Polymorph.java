public class Polymorph {
    public static void main(String[] args) {
        NumberType a;
        a = new decimal();
        a.convert(100);
        a = new Binary();
        a.convert(1234);
    }
}
//Task: Write a program using polymorphism to convert a number
//        from either binary or to decimal.
class NumberType{
    void convert(int num){
        System.out.println("this will convert the number"+num);
    }
}
class decimal extends NumberType{
    void convert(int num){
        int d=0;
        int n=0;
        while (true){
            if (num==0){
                break;
            }else {
                int temp=num%10;
                d+=temp*Math.pow(2,n);
                num=num/10;
                n++;
            }
        }
        System.out.println("the decimal representation is:"+d);
    }
}
class Binary extends NumberType{
    void convert(int num){
        StringBuilder b= new StringBuilder();
        while (num>=1){
            int rem=num%2;
            b.append(rem);
            num=num/2;
        }
        System.out.println("the binary representation is: "+b.reverse());
    }
}