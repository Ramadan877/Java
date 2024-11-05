






//
//// Threads:
//
//
//import java.util.concurrent.ThreadLocalRandom;
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//
//        System.out.println(Thread.activeCount());
//
//        System.out.println(Thread.currentThread().getName());
//
//        Thread.currentThread().setName("MAinnnn");
//
////        System.out.println(Thread.currentThread().getName());
////        System.out.println(Thread.currentThread().getPriority());
//
////        Thread.currentThread().setPriority(10);
////        System.out.println(Thread.currentThread().getPriority());
////        System.out.println(Thread.currentThread().isAlive());
////
////        for (int i = 3; i > 0; i--){
////            System.out.println(i);
////            Thread.sleep(1000);
////        }
////        System.out.println("You are done !");
//
//
//        MyThread thread2 = new MyThread();
////        System.out.println(thread2.isAlive());
//        thread2.start();
//
////        System.out.println(thread2.getName());
//        thread2.setName("2nd Thread");
//        System.out.println(thread2.getName());
//
//        System.out.println(thread2.getPriority());
//
//
//        System.out.println(thread2.isDaemon());
//            thread2.setDaemon(true);
//
//
//    }
//}
//
//
//class MyThread extends Thread{
//    @Override
//    public void run(){
//        System.out.println("This thread is running");
//    }
//}
//



// Daemon Thread:










//
//// Multithreading:
//
//public class Main {
//    public static void main(String[] args) {
//        MyThread thread1 = new MyThread();
//        thread1.start();
//
//        MyReversedThread thread2 = new MyReversedThread();
//        thread2.start();
//
//
//    }
//}
//class MyThread extends Thread{
//    public void run(){
//        for (int i = 10; i > 0; i--){
//            System.out.println("Thread 1 = " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread 1 is finished");
//    }
//}
//class MyReversedThread extends Thread{
//    @Override
//    public void run(){
//        for (int i = 0; i <= 10; i++){
//            System.out.println("Thread 2 = " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread 2 is finished");
//    }
//
//}



////
//// Runnable interface:
//
//
//public class Main {
//    public static void main(String[] args) {
//        MyThread thread1 = new MyThread();
//        MyRunnable runnable1 = new MyRunnable();
//
//        Thread thread2 = new Thread(runnable1);
//
//        thread1.start();
//        thread2.start();
//
//    }
//}
//
//class MyThread extends Thread{
//    @Override
//    public void run(){
//        for (int i = 10; i > 0; i--){
//            System.out.println("Thread 1 = " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread 1 is finished");
//    }
//}
//
//class MyRunnable implements Runnable{
//    @Override
//    public void run(){
//        for (int i = 0; i <= 10; i++){
//            System.out.println("Thread 2 = " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(1/0);
//        }
//        System.out.println("Thread 2 is finished");
//    }
//
//    }
//

//
//
//



//// Join Method:
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread thread1 = new MyThread();
//        MyRunnable runnable1 = new MyRunnable();
//
//        Thread thread2 = new Thread(runnable1);
//
//        thread1.start();
//        thread1.join(3000);
//        thread2.start();
//
//
//    }
//}
//
//class MyThread extends Thread{
//    @Override
//    public void run(){
//        for (int i = 10; i > 0; i--){
//            System.out.println("Thread 1 = " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread 1 is finished");
//    }
//}
//
//class MyRunnable implements Runnable{
//    @Override
//    public void run(){
//        for (int i = 0; i <= 10; i++){
//            System.out.println("Thread 2 = " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread 2 is finished");
//    }
//
//    }
//
//
//
//












//// Synchroized:
//
//public class Main {
//    private int count = 0;
//
//    public synchronized void increment(){
//        count++;
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Main example = new Main();
//
//        Thread t1 = new Thread(example::increment);
//        Thread t2 = new Thread(example::increment);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Synchronized - Final count: " + example.count);
//    }
//}
//
//






//
//// Lock Splitting:
//
//public class Main {
//    private int count1 = 0;
//    private int count2 = 0;
//
//    private final Object lock1 = new Object();
//    private final Object lock2 = new Object();
//
//    public void incrementCount1(){
//        synchronized (lock1){
//            count1++;
//        }
//    }
//    public void incrementCount2(){
//        synchronized (lock2){
//            count2++;
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Main example = new Main();
//
//        Thread t1 = new Thread(example::incrementCount1);
//        Thread t2 = new Thread(example::incrementCount2);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Lock Splitting - Final count1: " + example.count1 + " Final count2: " + example.count2);
//
//    }
//}
//
//




// Deadlock:
//
//public class Main {
//
//    private final Object lock1 = new Object();
//    private final Object lock2 = new Object();
//
//    public void task1(){
//        synchronized (lock1){
//            System.out.println("Task1 lock 1 acquired!");
//            try { Thread.sleep(100);} catch (InterruptedException e) {throw new RuntimeException(e);}
//            synchronized (lock2){
//                System.out.println("Task1 : lock 2 acquired");
//            }
//            }
//        }
//
//    public void task2(){
//        synchronized (lock2){
//            System.out.println("Task2 lock 2 acquired!");
//            try { Thread.sleep(100);} catch (InterruptedException e) {throw new RuntimeException(e);}
//            synchronized (lock1){
//                System.out.println("Task2 : lock 1 acquired");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Main example = new Main();
//
//        Thread t1 = new Thread(example::task1);
//        Thread t2 = new Thread(example::task2);
//
//        t1.start();
//        t2.start();
//
//    }
//}
//
//
//

//
////1. Lösung mit Lock ordering:
//
//public class Main {
//
//    private final Object lock1 = new Object();
//    private final Object lock2 = new Object();
//
//    public void task1(){
//        synchronized (lock1){
//            System.out.println("Task1 lock 1 acquired!");
//            try { Thread.sleep(100);} catch (InterruptedException e) {throw new RuntimeException(e);}
//            synchronized (lock2){
//                System.out.println("Task1 : lock 2 acquired");
//            }
//        }
//    }
//
//    public void task2(){
//        synchronized (lock1){
//            System.out.println("Task2 lock 1 acquired!");
//            try { Thread.sleep(100);} catch (InterruptedException e) {throw new RuntimeException(e);}
//            synchronized (lock2){
//                System.out.println("Task2 : lock 2 acquired");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Main example = new Main();
//
//        Thread t1 = new Thread(example::task1);
//        Thread t2 = new Thread(example::task2);
//
//        t1.start();
//        t2.start();
//
//    }
//}


//// Verwendung von Reentrantlock mit trylock:
//
//
//import java.util.InputMismatchException;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class Main {
//
//    private final ReentrantLock lock1 = new ReentrantLock();
//    private final ReentrantLock lock2 = new ReentrantLock();
//
//    public void task1() {
//        try {
//            if (lock1.tryLock()) {
//                System.out.println("Task 1 : lock 1 acquired");
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                }
//
//                if (lock2.tryLock()) {
//                    try {
//                        System.out.println("Task1 : lock 2 acquired");
//                    } finally {
//                        lock2.unlock();
//                    }
//                } else {
//                    System.out.println("Task 1 couldn't acquire lock 2, releasing lock 1 !");
//                }
//            }
//        } finally {
//            if (lock1.isHeldByCurrentThread()) {
//                lock1.unlock();
//            }
//
//        }
//    }
//
//
//
//    public void task2(){
//        try {
//            if (lock2.tryLock()) {
//                System.out.println("Task 2 : lock 2 acquired");
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                }
//
//                if (lock1.tryLock()) {
//                    try {
//                        System.out.println("Task2 : lock 1 acquired");
//                    } finally {
//                        lock1.unlock();
//                    }
//                } else {
//                    System.out.println("Task 2 couldn't acquire lock 1, releasing lock 2 !");
//                }
//            }
//        } finally {
//            if (lock2.isHeldByCurrentThread()) {
//                lock2.unlock();
//            }
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Main example = new Main();
//
//        Thread t1 = new Thread(example::task1);
//        Thread t2 = new Thread(example::task2);
//
//        t1.start();
//        t2.start();
//
//    }
//}
//
//
//



//
//// Wait / Notify:
//
//
//public class Main {
//    private final Object lock = new Object();
//    private boolean taskCompleted = false;
//
//    public void doWait(){
//        synchronized (lock){
//            while(!taskCompleted){
//                try {
//                    System.out.println("Warten auf Aufgabe... ");
//                    lock.wait();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            System.out.println("Aufgabe abgeschlossen, Fortsetzung der Arbeit!");
//        }
//    }
//
//    public void doNotify(){
//        synchronized (lock){
//            taskCompleted = true;
//            System.out.println("Benachrichtige, dass Aufgabe abgeschlossen ist !");
//            lock.notify();
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Main example = new Main();
//
//        Thread t1 = new Thread(example::doWait);
//        t1.start();
//
//        Thread.sleep(2000);
//
//        Thread t2 = new Thread(example::doNotify);
//        t2.start();
//    }
//}









//// Volatile:
//
//public class Main {
//    private volatile boolean running = true;
//
//    public void run(){
//        while (running){
//            System.out.println("Thread läuft !");
//        }
//        System.out.println("Thread gestoppt !");
//    }
//
//
//    public static void main(String[] args) throws InterruptedException {
//
//        Main example = new Main();
//
//        Thread t1 = new Thread(example::run);
//        t1.start();
//
//        Thread.sleep(1000);
//
//        example.running = false;
//
//    }
//}


//
//
//// ThreadPool mit callables:
//
//import java.util.concurrent.*;
//
//public class Main {
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//
//        Callable<Integer> task1 = () -> {
//            System.out.println("Task 1 wird ausgeführt");
//            Thread.sleep(500);
//            return 10;
//        };
//        Callable<Integer> task2 = () -> {
//            System.out.println("Task 2 wird ausgeführt ");
//            Thread.sleep(500);
//            return 20;
//        };
//
//        Future<Integer> future1 = executor.submit(task1);
//        Future<Integer> future2 = executor.submit(task2);
//
//        try {
//            System.out.println("Ergebnis von Task1 : " + future1.get());
//            System.out.println("Ergebnis von Task2 : " + future2.get());
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//
//        executor.shutdown();
//
//    }
//}
//











//
//// Enumerate :
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        Thread first = new Thread(() -> {
//            try {
//                Thread.sleep(1000);// Timed_Waiting
//                System.out.println("First Thread läuft !");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        first.setName("First");
//        first.start();
//
//        Thread second = new Thread(() -> {
//            try {
//                Thread.sleep(1000);// Timed_Waiting
//                System.out.println("Second Thread läuft !");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        second.setName("Second");
//        second.start();
//
//        Thread.sleep(100);
//
//        Thread[] threads = new Thread[64];
//
//        int n = Thread.enumerate(threads);
//
//
//        System.out.println("Anzahl der aktiven Threads: " + n);
//        for (int i = 0; i < n; i++){
//            Thread thread = threads[i];
//
//            System.out.println("Thread-ID" + thread.getId() + "Name: " + thread.getName());
//        }
//    }
//}
//













// Das Concurrent Packages:
//
//// Atomic Klassen:
//
//
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class Main {
//    private static AtomicInteger counter = new AtomicInteger(0);
//
//    public static void main(String[] args) {
//        Runnable incrementTask = () -> {
//            for (int i = 0; i < 1000; i++){
//                counter.incrementAndGet();
//            }
//        };
//        Thread thread1 = new Thread(incrementTask);
//        Thread thread2 = new Thread(incrementTask);
//
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Finaler Counter Wert: " + counter.get());
//    }
//}








//
//
//
//// Concurrent HashMap:
//
//import java.util.concurrent.ConcurrentHashMap;
//
//public class Main {
//    private static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
//
//    public static void main(String[] args) {
//        map.put("A", 1);
//        map.put("B", 2);
//
//        Runnable task = () -> {
//            map.putIfAbsent("C", 3);
//            map.computeIfPresent("A", (key,value) -> 1);
//        };
//
//        Thread thread1 = new Thread(task);
//        Thread thread2 = new Thread(task);
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("Final map: " + map);
//
//    }
//}
//


















//
//// CopyOnWriteArrayList:
//
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//public class Main {
//    private static List<String> list = new CopyOnWriteArrayList<>();
//    public static void main(String[] args) {
//        list.add("A");
//        list.add("B");
//
//        Runnable writeTask = () -> {
//            list.add("C");
//            list.add("D");
//        };
//
//        Runnable readTask = () -> {
//            for (String s : list){
//                System.out.println("Gelesen: " + s);
//            }
//        };
//
//        Thread thread1 = new Thread(writeTask);
//        Thread thread2 = new Thread(readTask);
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Final List: " + list);
//
//    }
//}



















//// ReentrantlockReadWriteLock:
//
//import java.util.concurrent.locks.ReentrantReadWriteLock;
//
//public class Main {
//    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//    private static String message = "hello";
//
//    public static void main(String[] args) {
//        Runnable writeTask = () -> {
//            lock.writeLock().lock();
//
//            try {
//                message = message.concat(" World");
//                System.out.println("Geschrieben : " + message);
//            }finally {
//                lock.writeLock().unlock();
//            }
//        };
//
//        Runnable readTask = () -> {
//            lock.readLock().lock();
//
//            try {
//                System.out.println("Gelesen : " + message);
//            }finally {
//                lock.readLock().unlock();
//            }
//        };
//
//        Thread thread1 = new Thread(writeTask);
//        Thread thread2 = new Thread(readTask);
//        thread1.start();
//        thread2.start();
//
//
//    }
//}
//









//
//
//import java.util.Locale;
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class Main {
//    private static final int BUFFER_SIZE = 10;
//    private int count = 0;
//    private final Lock lock = new ReentrantLock();
//    private final Condition bufferNotFull = lock.newCondition();
//    private final Condition bufferNotEmpty = lock.newCondition();
//
//    public static void main(String[] args) {
//        Main example = new Main();
//
//        // producer Thread:
//        Thread producer = new Thread(() -> {
//            for (int i = 0; i<20; i++){
//                example.produce();
//            }
//        }, "producer");
//        // Consumer Thread:
//        Thread consumer = new Thread(() -> {
//            for (int i = 0; i<20; i++){
//                example.consume();
//            }
//        }, "consumer");
//     producer.start();
//     consumer.start();
//
//     try {
//         producer.join();
//         consumer.join();
//     } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//     }
//    }
//
//    public void produce(){
//        lock.lock();
//        try {
//            while(count == BUFFER_SIZE){
//                System.out.println("Buffer voll !!" + Thread.currentThread().getName() + "Wartet ..");
//                bufferNotFull.await();
//            }
//            count++;
//            System.out.println(Thread.currentThread().getName() + " produziert ein Element, Aktueller Buffer: "+ count);
//            bufferNotEmpty.signal();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }finally {
//            lock.unlock();
//        }
//    }
//    public void consume(){
//        lock.lock();
//        try {
//            while(count == 0){
//                System.out.println("Buffer leer !!" + Thread.currentThread().getName() + "Wartet ..");
//                bufferNotEmpty.await();
//            }
//            count--;
//            System.out.println(Thread.currentThread().getName() + " konsumiert ein Element, Aktueller Buffer: "+ count);
//            bufferNotFull.signal();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }finally {
//            lock.unlock();
//        }
//    }
//}
//
//
//






//
//
//
//// Class Loading:
//
//
//import java.io.*;
//import java.lang.reflect.InvocationTargetException;
//
//public class Main {
//    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        CustomClassLoader loader = new CustomClassLoader("src/classesdir/classesdir.MyClass.class");
//
//        Class<?> myClass = loader.loadClass("classesdir.MyClass");
//
//        Object obj = myClass.getDeclaredConstructor().newInstance();
//
//        myClass.getMethod("sayHello").invoke(obj);
//    }
//}
//
//class CustomClassLoader extends ClassLoader{
//    private String classesDir;
//    public CustomClassLoader(String classesDir){
//        this.classesDir = classesDir;
//    }
//
//    @Override
//    protected Class<?> findClass(String name) throws ClassNotFoundException{
//        byte[] classData = null;
//        try {
//            classData = loadClassData(name);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        if(classData == null){
//            throw new ClassNotFoundException();
//        }
//        return defineClass(name, classData, 0, classData.length);
//    }
//
//    private byte[] loadClassData(String className) throws IOException {
//        String fileName = classesDir + className.replace('.', '/') + ".class";
//
//        InputStream inputStream = new FileInputStream(fileName);
//
//        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
//
//        int data = inputStream.read();
//        while(data != -1){
//            buffer.write(data);
//
//            data = inputStream.read();
//        }
//        inputStream.close();
//        return buffer.toByteArray();
//    }
//}
//
//
//













//// ClassLoader - Hierarchie: überprüfung der Parent-Delegation:
//
//public class Main {
//    public static void main(String[] args) {
//        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//        System.out.println("System ClassLoader: " + systemClassLoader);
//
//        ClassLoader extClassLoader = systemClassLoader.getParent();
//        System.out.println("Extension ClassLoader: " + extClassLoader);
//
//        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
//        System.out.println("BootstrapClassLoader: " + bootstrapClassLoader);
//    }
//}
//
//
//
//
//
//
//// Das parent Delegation Modell !
//
//














// Hot Deployment:

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
       try {

        while(true){
            System.out.println("Press Enter to reload the class ...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            HotDeploymentClassLoader loader = new HotDeploymentClassLoader("src/classesdir.MyClass.class");

            Class<?> clazz = loader.loadClass("classesdir.MyClass");

            Object instance = clazz.getDeclaredConstructor().newInstance();

            clazz.getMethod("sayHello").invoke(instance);

            System.out.println("Class reloaded Successfully !");
        }
    } catch (Exception e) {
           throw new RuntimeException(e);
       }
}}












//
