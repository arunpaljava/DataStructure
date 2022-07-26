package thread;
public class ThreadDeadLock {

    public static void main(String args[]) {
        ThreadDeadLock threadDeadLock = new ThreadDeadLock();
        Thread th = new Thread();
        Thread th1 = new Thread();
        th.start();
        th1.start();
    }

    public void run() {
        synchronized (Integer.class) {
            try {
                System.out.println("Thread-2 - Trying to lock on Integer");
                getIntergerResource();
                Thread.sleep(5000);
                System.out.println("Thread-2 - Trying to lock on String");
                getStringResource();
                System.out.println("Thread-2 - End of cycle");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private void getStringResource() throws InterruptedException {
        synchronized (String.class) {
            System.out.println("Lock on String");
            //wait();
        }
    }

    private void getIntergerResource() throws InterruptedException {
        synchronized (Integer.class) {
            System.out.println("Lock on Integer");
            //wait();
        }
    }


}

