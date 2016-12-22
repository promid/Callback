package dohomework;

/**
 * Created by DBQ on 2016/12/16.
 */
public class Student implements DoHomeWork {

    private int status; // 作业完成情况, 从1开始, 10代表完成

    public int getStatus() {
        return status;
    }

    @Override
    public void setProgress(int status) {
        this.status = status;
    }

    @Override
    public void doHomeWork(String question, String answer) {
        System.out.println("作业本");
        if(answer != null) {
            System.out.println("作业："+question+" 答案："+ answer);
        } else {
            System.out.println("作业："+question+" 答案："+ "(空白)");
        }
    }

    public void ask(final String homework, final RoomMate roomMate) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                roomMate.getAnswer(homework, Student.this);
            }
        }).start();*/
        new Thread(() -> roomMate.getAnswer(homework, this)).start();
        goHome();
    }

    public void goHome(){
        System.out.println("我回家了……好室友，帮我写下作业。");
    }

}
