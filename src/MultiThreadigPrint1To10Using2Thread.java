import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;

public class MultiThreadigPrint1To10Using2Thread {

    int counter =1;
    static int N=20;
    public static void main(String s[]){
       MultiThreadigPrint1To10Using2Thread  mt = new MultiThreadigPrint1To10Using2Thread();
        Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   mt.printOddNum();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }
       });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mt.printEvenNumber();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
        t1.start();

    }

    private void printEvenNumber() throws InterruptedException {
        synchronized (this) {
            while (counter<N){
                while (counter%2!=0){
                    wait();
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }

    private void printOddNum() throws InterruptedException {
        synchronized (this) {
            while (counter<N){
                while (counter%2==0){
                    wait();
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }


}
