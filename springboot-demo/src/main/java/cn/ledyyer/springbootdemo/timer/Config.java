package cn.ledyyer.springbootdemo.timer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("SpringService")
    public SpringUtil init(){
        return new SpringUtil();
    }
}
