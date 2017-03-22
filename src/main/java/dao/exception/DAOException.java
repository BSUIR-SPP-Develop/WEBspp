package dao.exception;

/**
 * Created by dmirry on 02.03.17.
 */
public class DAOException extends Exception {

    private static final long serialVersionUID = 1L;

    public DAOException(){
        super();
    }

    public DAOException(String message){
        super(message);
    }

    public DAOException(Exception e){
        super(e);
    }

    public DAOException(String message, Exception e){
        super(message, e);
    }
}