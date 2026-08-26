public class RectArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("area of rectangle is: "+ r.rectangleArea());

    }
}
 class Rectangle{
    int l=10;
    int h=9;
      void setValue(int x, int y){
         l=9;
         h=10;
//         return x;
     }
//     Rectangle r1 = new Rectangle();

    int rectangleArea(){
        return l*h;
    }
}
//class Rectangle2(int a, int b){
//
//}
