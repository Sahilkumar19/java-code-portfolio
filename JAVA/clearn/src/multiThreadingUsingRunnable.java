public class multiThreadingUsingRunnable {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < 5; i++) {
            multiThreadingRunnable obj = new multiThreadingRunnable();
            Thread thread = new Thread(obj);
            thread.start();
        }
    }
}
class multiThreadingRunnable implements Runnable{
    public void run(){
        try{
            System.out.println(
                    "Thread"+" "+Thread.currentThread().threadId()+" "+"is running"
            );
        }catch (Exception e){
            System.out.println("exception is caught");
        }
    }

}
