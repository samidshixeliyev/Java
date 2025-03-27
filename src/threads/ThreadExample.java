package threads;

public class ThreadExample {
    public static void main(String[] args) {
        // Yeni bir Thread yaradırıq
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Bu thread-in etdiyi iş
                System.out.println("Thread işləyir!");
            }
        });

        thread.start(); // Thread-i işə salırıq
    }
}
