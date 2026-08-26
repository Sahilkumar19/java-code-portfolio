public class Area {
    public static void main(String[] args) {
        int l = 4;
        int b = 5;
        int area = AreaOfRectangle(l,b);

        System.out.println("The area of rectangle is" + " " +  area);

//        int area = l*b;
//        System.out.println("The area of rectangle is" + " " +  area);
    }
    static int AreaOfRectangle(int l, int b){
        return l*b;
    }


}

