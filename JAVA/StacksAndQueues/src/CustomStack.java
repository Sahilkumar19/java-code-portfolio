public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data=new int[size];
    }

    public static void main(String[] args) {
    }
}
