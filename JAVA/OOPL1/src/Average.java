//write a program to print the average of three numbers
public class Average {
    public static void main(String[] args) {
        int a=2,b=4,c=9;
        int sum = a+b+c;
        int average = sum/3;
        System.out.println("The average is:"+" "+ average);
        int sum2=0;
        for (int i = 1; i < 100; i++) {
            if(i%2==0){
                sum2+=i;
            }
        }
//        System.out.println(i);
        System.out.println("The average of even numbers from 1 to 100 is:"+" "+ sum2/100);
    }
}
