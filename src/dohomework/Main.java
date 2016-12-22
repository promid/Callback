package dohomework;

/**
 * Created by DBQ on 2016/12/16.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Student student = new Student();
        String homework = "当x趋向于0，sin(x)/x =?";
        student.ask(homework, new RoomMate());
        while(true){
            int i = student.getStatus();
            System.out.println("作业完成进度: " + i*10 + "%");
            Thread.sleep(1000);
            if(i == 10){
                break;
            }
        }
    }

}
