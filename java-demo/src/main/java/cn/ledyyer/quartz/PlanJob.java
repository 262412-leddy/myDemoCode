package cn.ledyyer.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.TriggerKey;

public class PlanJob implements Job {
    MeetingService meetingService = new MeetingService();

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        TriggerKey triggerKey = jobExecutionContext.getTrigger().getKey();
    }
}
