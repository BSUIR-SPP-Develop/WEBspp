package bean.entity;

import java.util.Date;

/**
 * Created by dmirry on 05.03.17.
 */
public class StatusDescription {
    String markOfContidion;
    int idStatement;
    Date dateOfEvalution;
    int idBook;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusDescription that = (StatusDescription) o;

        if (idStatement != that.idStatement) return false;
        if (idBook != that.idBook) return false;
        if (markOfContidion != null ? !markOfContidion.equals(that.markOfContidion) : that.markOfContidion != null)
            return false;
        return dateOfEvalution != null ? dateOfEvalution.equals(that.dateOfEvalution) : that.dateOfEvalution == null;
    }

    @Override
    public int hashCode() {
        int result = markOfContidion != null ? markOfContidion.hashCode() : 0;
        result = 31 * result + idStatement;
        result = 31 * result + (dateOfEvalution != null ? dateOfEvalution.hashCode() : 0);
        result = 31 * result + idBook;
        return result;
    }

    public String getMarkOfContidion() {
        return markOfContidion;
    }

    public void setMarkOfContidion(String markOfContidion) {
        this.markOfContidion = markOfContidion;
    }

    public int getIdStatement() {
        return idStatement;
    }

    public void setIdStatement(int idStatement) {
        this.idStatement = idStatement;
    }

    public Date getDataTime() {
        return dateOfEvalution;
    }

    public void setDataTime(Date dataTime) {
        this.dateOfEvalution = dataTime;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }
}
