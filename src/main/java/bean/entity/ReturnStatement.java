package bean.entity;

/**
 * Created by dmirry on 05.03.17.
 */
public class ReturnStatement {
    int idReturnStatement;
    int status;
    int idBook;
    int idClaim;
    int idStatusDescription;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReturnStatement that = (ReturnStatement) o;

        if (idReturnStatement != that.idReturnStatement) return false;
        if (idBook != that.idBook) return false;
        return idClaim == that.idClaim;
    }

    @Override
    public int hashCode() {
        int result = idReturnStatement;

        result = 31 * result + idBook;
        result = 31 * result + idClaim;
        return result;
    }

    public int getIdReturnStatement() {
        return idReturnStatement;
    }

    public void setIdReturnStatement(int idReturnStatement) {
        this.idReturnStatement = idReturnStatement;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdStatusDescription() {
        return idStatusDescription;
    }

    public void setIdStatusDescription(int idStatusDescription) {
        this.idStatusDescription = idStatusDescription;
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

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "idReturnStatement=" + idReturnStatement +
                ", status=" + status +
                ", idBook=" + idBook +
                ", idClaim=" + idClaim +
                ", idStatusDescription=" + idStatusDescription +
                '}';
    }
}
