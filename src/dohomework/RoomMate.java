package dohomework;

import java.util.concurrent.TimeUnit;

/**
 * Created by DBQ on 2016/12/16.
 */
public class RoomMate {
    public void getAnswer(String homework, DoHomeWork someone) {
        if ("1+1=?".equals(homework)) {
            someone.doHomeWork(homework, "2");
        } else if("当x趋向于0，sin(x)/x =?".equals(homework)) {
            System.out.print("室友在做题：");
            for(int i=1; i<=10; i++) {
                someone.setProgress(i);
                System.out.print(i+"秒 ");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            someone.doHomeWork(homework, "1");
        } else {
            someone.doHomeWork(homework, "(空白)");
        }
    }

}
