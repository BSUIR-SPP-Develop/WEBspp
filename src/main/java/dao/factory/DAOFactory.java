package dao.factory;

import dao.impl.DataBase;

/**
 * Created by dmirry on 02.03.17.
 */

public class DAOFactory {
    private static DAOFactory instance = new DAOFactory();
    private DataBase dataBase = new DataBase();

    public static DAOFactory getInstance() {
        return instance;
    }

    public DataBase getDataBase() {
        return dataBase;
    }
    
}
