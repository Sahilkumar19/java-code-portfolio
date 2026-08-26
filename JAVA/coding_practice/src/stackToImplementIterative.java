public class stackToImplementIterative {
    public static void main(String[] args) {
        int n = 5;
        int factorial = findFactorialUsingStack(n);
        System.out.println(factorial);
    }
//    recursive approach to factorial
    public static int findFactorial(int n){
        if (n <= 1){
            return 1;
        }else {
            return n*findFactorial(n-1);
        }
    }
//    iteratively using stack
    public static int findFactorialUsingStack(int n){
        Stack<Integer> stack = new Stack<>();
        int factorial = 1;
        stack.push(n);
        while (!stack.isEmpty()){
            int current = stack.pop();
            if (current <= 1){
                continue;
            }
            factorial = factorial * current;
            stack.push(current - 1);
        }
        return factorial;
    }
}
