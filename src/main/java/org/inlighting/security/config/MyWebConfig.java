package org.inlighting.security.config;

import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.util.IntrospectorCleanupListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

// https://openhome.cc/Gossip/Spring/Controller.html
// https://blog.elliot.tw/?p=381
// https://openhome.cc/Gossip/ServletJSP/Configuration.html
// https://blog.csdn.net/xinluke/article/details/53020113

public class MyWebConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{
    public MyWebConfig() {

    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addListener(HttpSessionEventPublisher.class);
        //servletContext.addListener(RequestContextListener.class);
        //servletContext.addListener(IntrospectorCleanupListener.class);
        super.onStartup(servletContext);
    };


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
