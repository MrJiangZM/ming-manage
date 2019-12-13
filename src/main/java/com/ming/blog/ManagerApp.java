package com.ming.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.rmi.runtime.Log;

/**
 * @author Jiang Zaiming
 * @date 2019/12/12 3:02 下午
 */
@Slf4j
@SpringBootApplication
public class ManagerApp {

    public static void main(String[] args) {
        SpringApplication.run(ManagerApp.class, args);
        log.info("manage start success");
    }

}
