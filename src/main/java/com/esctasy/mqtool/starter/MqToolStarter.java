package com.esctasy.mqtool.starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MqToolStarter implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("1");
    }
}
