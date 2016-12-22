package test1;

/**
 * Created by DBQ on 2016/12/20.
 */
public class Test1 {

    public static void main(String[] args) {
        Th1 t1 = new Th1();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}

class Th1 implements Runnable{

    @Override
    public void run() {
        while(true){

        }
    }
}
