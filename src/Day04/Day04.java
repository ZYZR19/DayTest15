package Day04;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-23
 * Time: 10:17
 */
public class Day04 {
    static class Test {
        private int data;
        int result = 0;
        public void m() {
            result += 2;
            data += 2;
            System.out.print(result + "  " + data);
        }
    }
    static class ThreadExample extends Thread {
        private Test mv;
        public ThreadExample(Test mv)     {
            this.mv = mv;
        }
        public void run()     {
            synchronized(mv) {
                mv.m();
            }
        }
    }

        public static void main(String args[]) {
            Test mv = new Test();
            Thread t1 = new ThreadExample(mv);
            Thread t2 = new ThreadExample(mv);
            Thread t3 = new ThreadExample(mv);
            t1.start();
            t2.start();
            t3.start();
        }



}
