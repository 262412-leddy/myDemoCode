package cn.ledyyer.quartz;

public class MeetingService {
    public void calClassMeeting() throws InterruptedException {
        System.out.println("会议开始...");
        Thread.sleep(5000);
        System.out.println("会议结束...");
    }
}
