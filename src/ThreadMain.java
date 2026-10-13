//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class ThreadMain {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();


        MyRunnable task1 = new MyRunnable();
        MyRunnable2 task2 = new MyRunnable2();
        Thread thread3 = new Thread(task1);
        Thread thread4 = new Thread(task2);
        thread3.start();
        thread4.start();
    }
}