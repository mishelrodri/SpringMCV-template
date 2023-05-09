package com.ues.springmvc.configurador;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
public class SpringInicializador implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        // TODO Auto-generated method stub
        AnnotationConfigWebApplicationContext contexto = new
                AnnotationConfigWebApplicationContext();
        //registramos beans al configurador
        contexto.register(ConfiguradorSpring.class);
        //nos liga ee contexto a la aplicacion
        contexto.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet =
                servletContext.addServlet("dispacher",
                        new DispatcherServlet(contexto));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");

    }
}

