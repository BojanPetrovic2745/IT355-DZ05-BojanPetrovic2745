package met.local.web;

import java.util.Set;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import met.local.config.AutomobilConfiguration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AutomobilServletContainerInitializer implements ServletContainerInitializer{

   @Override
    public void onStartup(Set<Class<?>> set, ServletContext sc) throws ServletException {
       
        AnnotationConfigWebApplicationContext applicationContext
                = new AnnotationConfigWebApplicationContext();
        
        applicationContext.register(AutomobilConfiguration.class);
        
        DispatcherServlet dispatcherServlet = 
                new DispatcherServlet(applicationContext);
        
        ServletRegistration.Dynamic courtRegistration
                = sc.addServlet("automobil", dispatcherServlet);
        
        courtRegistration.setLoadOnStartup(1);
        courtRegistration.addMapping("/");
    }
    
}
