package cn.ledyyer.springbootdemo.timer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SpringService {
    public void doSpringService(){
        log.info("do springService...");
    }
}
