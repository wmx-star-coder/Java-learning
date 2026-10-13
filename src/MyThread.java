//耦合度高，不推荐实际开发使用
public class MyThread extends Thread {
    public void run()
    {
        for(int i=0;i<50;i++){
            System.out.println(i+"===继承thread线程");
        }
    }
}
