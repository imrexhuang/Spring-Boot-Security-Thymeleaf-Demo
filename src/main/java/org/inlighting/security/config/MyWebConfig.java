package org.inlighting.security.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// https://openhome.cc/Gossip/Spring/Controller.html
// https://blog.elliot.tw/?p=381

public class MyWebConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{
    public MyWebConfig() {

    }

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ApplicationConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
