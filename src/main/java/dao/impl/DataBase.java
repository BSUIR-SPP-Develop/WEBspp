package dao.impl;

/**
 * Created by dmirry on 02.03.17.
 */


import bean.Result;
import dao.IDataBase;
import dao.exception.DAOException;
import dao.util.ResultHandler;

import java.sql.*;
import java.util.ArrayList;

public class DataBase implements IDataBase {

    private final static String URL = "jdbc:mysql://localhost:3307/spp?useSSL=false&characterEncoding=UTF-8";
    private final static String USER = "root";
    private final static String PASSWORD = "OOPSOOPS12";

    private final static String SQL_SELECT_AUTHORS = "SELECT * FROM Author";
    private final static String SQL_SELECT_BOOKS = "SELECT * FROM Book";
    private final static String SQL_SELECT_CLAIMS = "SELECT * FROM Claim";
    private final static String SQL_SELECT_COMMENTS = "SELECT * FROM Comment";
    private final static String SQL_SELECT_NEWS = "SELECT * FROM News";
    private final static String SQL_SELECT_PERSON = "SELECT * FROM Person";
    private final static String SQL_SELECT_RETURN_STATEMENT = "SELECT * FROM Return_Statement";
    private final static String SQL_SELECT_STATUS_DISCRIPTION = "SELECT * FROM Status_Description";
    private final static String SQL_SELECT_USER = "SELECT * FROM User";

    public Result getAllDatabaseInformation() throws DAOException {
        Result result = null;
        Connection connection = null;
        Statement statement = null;


        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            ArrayList temp = new ArrayList();
            ResultSet resultSet;
            resultSet = statement.executeQuery(SQL_SELECT_AUTHORS);
            temp.add(ResultHandler.authorElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_BOOKS);
            temp.add(ResultHandler.bookElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_COMMENTS);
            temp.add(ResultHandler.commentElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_CLAIMS);
            temp.add(ResultHandler.claimElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_NEWS);
            temp.add(ResultHandler.newsElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_PERSON);
            temp.add(ResultHandler.personElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_RETURN_STATEMENT);
            temp.add(ResultHandler.returnStatmenetElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_STATUS_DISCRIPTION);
            temp.add(ResultHandler.statucDiscriptionElements(resultSet));

            resultSet = statement.executeQuery(SQL_SELECT_USER);
            temp.add(ResultHandler.userElements(resultSet));

            result = ResultHandler.getResult(temp);
        } catch(SQLException exception) {
            throw new DAOException(exception);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
        return result;
    }

    public void init() throws DAOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            throw new DAOException(exception);
        }
    }

}
