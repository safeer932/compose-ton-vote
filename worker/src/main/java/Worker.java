public class Worker {
    public static void main(String[] args) {
        System.out.println("Worker is running...");
        while(true) {
            try {
                Thread.sleep(5000);
                System.out.println("Worker working...");
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
