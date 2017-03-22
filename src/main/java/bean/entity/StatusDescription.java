package bean.entity;

import java.util.Date;

/**
 * Created by dmirry on 05.03.17.
 */
public class StatusDescription {
    int idStatusDescription;
    String markOfContidion;
    Date dateOfEvalution;

    public int getIdStatusDescription() {
        return idStatusDescription;
    }

    public void setIdStatusDescription(int idStatusDescription) {
        this.idStatusDescription = idStatusDescription;
    }

    public String getMarkOfContidion() {
        return markOfContidion;
    }

    public void setMarkOfContidion(String markOfContidion) {
        this.markOfContidion = markOfContidion;
    }

    public Date getDateOfEvalution() {
        return dateOfEvalution;
    }

    public void setDateOfEvalution(Date dateOfEvalution) {
        this.dateOfEvalution = dateOfEvalution;
    }

    @Override
    public String toString() {
        return "StatusDescription{" +
                "idStatusDescription=" + idStatusDescription +
                ", markOfContidion='" + markOfContidion + '\'' +
                ", dateOfEvalution=" + dateOfEvalution +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatusDescription that = (StatusDescription) o;

        if (idStatusDescription != that.idStatusDescription) return false;
        if (markOfContidion != null ? !markOfContidion.equals(that.markOfContidion) : that.markOfContidion != null)
            return false;
        return dateOfEvalution != null ? dateOfEvalution.equals(that.dateOfEvalution) : that.dateOfEvalution == null;
    }

    @Override
    public int hashCode() {
        int result = idStatusDescription;
        result = 31 * result + (markOfContidion != null ? markOfContidion.hashCode() : 0);
        result = 31 * result + (dateOfEvalution != null ? dateOfEvalution.hashCode() : 0);
        return result;
    }
}

