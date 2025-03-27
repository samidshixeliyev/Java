package threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Thread Class ilə Thread Yaratmaq ===");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("\n=== Runnable Interface ilə Thread Yaratmaq ===");
        Thread r1 = new Thread(new MyRunnable());
        Thread r2 = new Thread(new MyRunnable());
        r1.start();
        r2.start();
        r1.join();
        r2.join();

        System.out.println("\n=== Synchronization Nümunəsi ===");
        Counter counter = new Counter();
        Thread syncT1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });
        Thread syncT2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });
        syncT1.start();
        syncT2.start();
        syncT1.join();
        syncT2.join();
        System.out.println("Son nəticə: " + counter.getCount());

        System.out.println("\n=== Deadlock Nümunəsi ===");
       /* Resource r1Lock = new Resource();
        Resource r2Lock = new Resource();
        Thread deadlockT1 = new Thread(() -> r1Lock.methodA(r2Lock), "Thread 1");
        Thread deadlockT2 = new Thread(() -> r2Lock.methodA(r1Lock), "Thread 2");
        deadlockT1.start();
        deadlockT2.start();
        deadlockT1.join();
        deadlockT2.join();*/

        System.out.println("\n=== Volatile Nümunəsi ===");
        SharedResource sharedResource = new SharedResource();
        Thread volatileT1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.toggle();
                System.out.println("Thread 1 flag: " + sharedResource.getFlag());
            }
        });
        Thread volatileT2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 flag: " + sharedResource.getFlag());
            }
        });
        volatileT1.start();
        volatileT2.start();
        volatileT1.join();
        volatileT2.join();
    }
}
