public class AnonymousClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an example of an anonymous inner class.");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
