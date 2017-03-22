package bean.entity;

/**
 * Created by dmirry on 05.03.17.
 */
public class ReturnStatement {
    int idReturn;
    int idUser;
    int idBook;
    int idClaim;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReturnStatement that = (ReturnStatement) o;

        if (idReturn != that.idReturn) return false;
        if (idUser != that.idUser) return false;
        if (idBook != that.idBook) return false;
        return idClaim == that.idClaim;
    }

    @Override
    public int hashCode() {
        int result = idReturn;
        result = 31 * result + idUser;
        result = 31 * result + idBook;
        result = 31 * result + idClaim;
        return result;
    }

    public int getIdReturn() {
        return idReturn;
    }

    public void setIdReturn(int idReturn) {
        this.idReturn = idReturn;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdClaim() {
        return idClaim;
    }

    public void setIdClaim(int idClaim) {
        this.idClaim = idClaim;
    }
}
