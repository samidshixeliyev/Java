package threads;

public class Resource {
    void methodA(Resource r) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " methodA icra edir");
            synchronized (r) {
                System.out.println(Thread.currentThread().getName() + " methodB-ni gözləyir...");
            }
        }
    }
}