package service;

/**
 * Created by dmirry on 02.03.17.
 */
public class ServiceFactory {
    private final static ServiceFactory instance = new ServiceFactory();
    private Service service = new Service();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public Service getService() {
        return service;
    }
}
