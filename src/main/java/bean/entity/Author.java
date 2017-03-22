package bean.entity;

/**
 * Created by dmirry on 05.03.17.
 */
public class Author {
    int idAuthor;
    String fullName;

    @Override
    public String toString() {
        return "Author{" +
                "idAuthor=" + idAuthor +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (idAuthor != author.idAuthor) return false;
        return fullName != null ? fullName.equals(author.fullName) : author.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = idAuthor;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
//hashcode vezde perepisat esli nado bydet