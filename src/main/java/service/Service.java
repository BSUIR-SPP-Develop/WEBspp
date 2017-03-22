package service;

import bean.Result;
import dao.IDataBase;
import dao.exception.DAOException;
import dao.factory.DAOFactory;

/**
 * Created by dmirry on 02.03.17.
 */
public class Service implements IService {

    public Result getAllDatabaseInformation() throws ServiceException {
        IDataBase dataBase = getDataBase();
        Result result = null;

        try {
            result = dataBase.getAllDatabaseInformation();
        } catch (DAOException exception) {
            throw new ServiceException(exception);
        }

        return result;
    }

    public void init() throws ServiceException {
        IDataBase dataBase = getDataBase();

        try {
            dataBase.init();
        } catch (DAOException exception) {
            throw new ServiceException(exception);
        }
    }

    private IDataBase getDataBase() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        return daoFactory.getDataBase();
    }
}