public class ExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try{
//            System.out.println("inside the try block");
            int i = arr[3];
            System.out.println("inside the try block2");
        }catch (NullPointerException e){
            System.out.println("Arithmetic exception caught"+" "+e.getMessage());
        }finally {
            System.out.println("this is final block");
        }
        System.out.println("out of try-catch and finally block");
    }
}

