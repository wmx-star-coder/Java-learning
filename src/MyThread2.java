public class MyThread2 extends Thread {
    public void run()
    {
        for(int i=0;i<50;i++){
            System.out.println(i+"~~~继承thread线程");
        }
    }
}
