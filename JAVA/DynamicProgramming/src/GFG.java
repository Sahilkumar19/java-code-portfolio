public class GFG {
    public static void main(String[] args) {
        if (args.length>0){
            System.out.println("the command line arguments are:");
            for (String val:args)
                System.out.println(val);
        }else {
            System.out.println("no command line arguments found");
        }
    }
}
