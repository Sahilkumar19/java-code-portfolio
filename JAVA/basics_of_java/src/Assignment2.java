import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // Basic Java Program
        // 1. Area of a circle Java program
        Scanner input = new Scanner(System.in);
//        System.out.println("enter radius:");
//        double r = input.nextDouble();
//        double area = Math.PI * Math.pow(r , 2);
//        System.out.println("the are of the circle is " + " " + area);

        //2. Area of a triangle.
//        System.out.println("enter side1:");
//        double s1 = input.nextDouble();
//        System.out.println("enter side2:");
//        double s2 = input.nextDouble();
//        System.out.println("enter side3:");
//        double s3 = input.nextDouble();
//        double sp = (s1 + s2 + s3) / 2;
//        double area = Math.sqrt(sp * (sp - s1) * (sp - s2) * (sp - s3) );
//        System.out.println("area of triangle is : " + area);

        // Area of rectangle program
//        System.out.println("enter length:");
//        double l = input.nextDouble();
//        System.out.println("enter breadth:");
//        double b = input.nextDouble();
//        double area = l * b;
//        System.out.println("area of rectangle: " + area);

        // Area of isosceles triangle
//        System.out.println("enter base");
//        double base = input.nextDouble();
//        System.out.println("enter s1:");
//        double s1 = input.nextDouble();
//        System.out.println("enter s2:");
//        double s2 = input.nextDouble();
//        double area = (base/4) * Math.sqrt(4 * Math.pow(s1 , 2) - Math.pow(s2 , 2));
//        System.out.println("area of isosceles triangle is: " + area);
        // Area of a parallelogram
//        System.out.println("enter base:");
//        double b = input.nextDouble();
//        System.out.println("enter height:");
//        double h = input.nextDouble();
//        double area = b * h;
//        System.out.println("area of parallelogram is: " + area);
        // Area of rhombus
//        System.out.println("enter diagonal 1:");
//        double d1 = input.nextDouble();
//        System.out.println("enter diagonal 2:");
//        double d2 = input.nextDouble();
//        double area = (1/2) * (d1 * d2);
//        System.out.println("area of rhombus is: " + area);
        // Area of an equilateral triangle
//        System.out.println("enter side:");
//        double a = input.nextDouble();
//        double area = (Math.sqrt(3) / 4) * Math.pow(a , 2);
//        System.out.println("area: " + area);
        // Perimeter of a circle
//        System.out.println("enter radius:");
//        double r = input.nextDouble();
//        double perimeter = 2 * Math.PI * r;
//        System.out.println("area:" + perimeter);
        // Perimeter of an equilateral triangle
//        System.out.println("enter side:");
//        double a = input.nextDouble();
//        double perimeter = 3 * a;
//        System.out.println("perimeter: " + perimeter);
        // subtract the product and sum of digits of an integer
//        System.out.println("enter integer:");
//        int num = input.nextInt();
//        int product = 1;
//        int sum = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            product = product * rem;
//            sum = sum + rem;
//            num = num / 10;
//
//        }
//        int subtraction = product - sum;
//        System.out.println("the value of subtraction of product and sum of digits is: " + subtraction);
        // input a number and print all the factors of that number(use loop)
        System.out.println("enter a number:");
        int num = input.nextInt();
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }

        }
        

    }
}
