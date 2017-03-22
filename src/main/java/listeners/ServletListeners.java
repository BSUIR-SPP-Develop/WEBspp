package listeners;

import service.Service;
import service.ServiceException;
import service.ServiceFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by dmirry on 02.03.17.
 */
public class ServletListeners implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
       /* try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            Service service = serviceFactory.getService();
            service.init();
        } catch (ServiceException exception) {
            exception.printStackTrace();
            throw new RuntimeException();
        }*/
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
