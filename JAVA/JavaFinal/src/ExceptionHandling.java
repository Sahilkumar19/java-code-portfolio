public class ExceptionHandling {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
//            e.printStackTrace(); // java.lang.exceptionname:discription of exception
                                    //at file.main(file.java:10)
//            System.out.println(e.toString()); //java.lang.exceptionname:discription of exception
//            System.out.println(e.getMessage()); //discription of exception
        }
    }

}
class HelloWorld {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        int res;
        try {
            res=a/b;
            System.out.println(res);
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
    }
}
