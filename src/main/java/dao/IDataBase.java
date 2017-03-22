package dao;

import bean.Result;
import dao.exception.DAOException;

/**
 * Created by dmirry on 02.03.17.
 */
public interface IDataBase {
    Result getAllDatabaseInformation() throws DAOException;
    void init() throws DAOException;
}
