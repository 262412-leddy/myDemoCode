package cn.ledyyer.springbootdemo.timer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Timer;
import java.util.TimerTask;

@Slf4j
@Component
public class CpkOverAllTimer2 {
    private Timer timer = null;
    private TimerTask timerTask = null;


    //@Autowired
    //private SomethingService somethingService;

    public CpkOverAllTimer2() {
        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                new SomethingService();
            }
        };
    }

    @PostConstruct
    public void init(){
        timer.schedule(timerTask,2000,1000);
    }

    @PreDestroy
    public void destroy(){
        timer.cancel();
        timerTask.cancel();
        timer = null;
        timerTask = null;
    }
}
