package org.inlighting.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityDemoApplication {

    public static void main(String[] args) {
        // https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html
        //System.setProperty("spring.devtools.restart.enabled", "false"); //false表示關閉熱部署(Hot Swap)

        SpringApplication.run(SecurityDemoApplication.class, args);
    }
}

