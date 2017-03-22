package bean.entity;

/**
 * Created by dmirry on 05.03.17.
 */
public class Claim {
    int idClaim;
    int idUser;
    int idBook;
    int idPerson;

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Claim claim = (Claim) o;
        if (idClaim != claim.idClaim) return false;
        if (idUser != claim.idUser) return false;
        return idBook == claim.idBook;
    }

    @Override
    public int hashCode() {
        int result = idClaim;
        result = 31 * result + idUser;
        result = 31 * result + idBook;
        return result;
    }

    public int getIdClaim() {
        return idClaim;
    }

    public void setIdClaim(int idClaim) {
        this.idClaim = idClaim;
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
}
