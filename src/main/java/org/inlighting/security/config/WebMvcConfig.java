package org.inlighting.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// https://openhome.cc/Gossip/Spring/Controller.html
// https://blog.elliot.tw/?p=381

@Configuration
@EnableWebMvc
@ComponentScan("org.inlighting.security.controller")

public class WebMvcConfig implements WebMvcConfigurer{
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
