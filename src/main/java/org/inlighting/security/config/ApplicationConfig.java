package org.inlighting.security.config;

import org.springframework.context.annotation.Configuration;
import org.inlighting.security.servlet.TestServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

// https://blog.elliot.tw/?p=381

@Configuration
public class ApplicationConfig {

    @Bean
    public TestServlet testServlet(){
        return new TestServlet();
    }

    @Bean
    public ServletRegistrationBean testServletRegistrationBean(TestServlet testServlet){
        ServletRegistrationBean registration = new ServletRegistrationBean(testServlet);
        registration.setEnabled(true);
        //mvn spring-boot:run執行後，瀏覽器開啟 http://localhost:8080/servlet/test 確認是否正常運作
        registration.addUrlMappings("/servlet/test");
        return registration;
    }

}
