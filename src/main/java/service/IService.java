package service;

import bean.Result;

/**
 * Created by dmirry on 02.03.17.
 */
public interface IService {
    Result getAllDatabaseInformation() throws ServiceException;
}
