package Thread;

public class threadDemo1 {
    static  class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("hello,我是一个线程");
        }
    }

    public static void main(String[] args) {
        Thread t = new MyThread() ;
       t.start();//执行这个方法才会真的创建线程
       //此时内核才会有pcb 这个pcb就会让cpu来执行该线程中的run方法
    }
}
