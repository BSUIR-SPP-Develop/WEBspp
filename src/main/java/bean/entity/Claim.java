package bean.entity;

/**
 * Created by dmirry on 05.03.17.
 */
public class Claim {
    int idClaim;
    int idUser;
    int idBook;
    int idPerson;
    int bookStatusDescription;


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

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getBookStatusDescription() {
        return bookStatusDescription;
    }

    public void setBookStatusDescription(int bookStatusDescription) {
        this.bookStatusDescription = bookStatusDescription;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "idClaim=" + idClaim +
                ", idUser=" + idUser +
                ", idBook=" + idBook +
                ", idPerson=" + idPerson +
                ", bookStatusDescription=" + bookStatusDescription +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Claim claim = (Claim) o;

        if (idClaim != claim.idClaim) return false;
        if (idUser != claim.idUser) return false;
        if (idBook != claim.idBook) return false;
        if (idPerson != claim.idPerson) return false;
        return bookStatusDescription == claim.bookStatusDescription;
    }

    @Override
    public int hashCode() {
        int result = idClaim;
        result = 31 * result + idUser;
        result = 31 * result + idBook;
        result = 31 * result + idPerson;
        result = 31 * result + bookStatusDescription;
        return result;
    }
}
