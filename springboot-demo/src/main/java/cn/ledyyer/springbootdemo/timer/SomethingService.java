package cn.ledyyer.springbootdemo.timer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SomethingService {
    public SomethingService(){
        SpringUtil.getSpringService().doSpringService();
    }

    public void one(){
        log.info("111");
    }

    public void two(){
        log.info("222");
    }

}
