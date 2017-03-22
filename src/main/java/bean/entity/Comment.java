package bean.entity;

/**
 * Created by dmirry on 05.03.17.
 */
public class Comment {
    int idComment;
    String content;
    int idUser;
    int idBook;
    int idPerson;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (idComment != comment.idComment) return false;
        if (idUser != comment.idUser) return false;
        if (idBook != comment.idBook) return false;
        return content != null ? content.equals(comment.content) : comment.content == null;
    }

    @Override
    public int hashCode() {
        int result = idComment;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + idUser;
        result = 31 * result + idBook;
        return result;
    }
    public int getIdPerson() {return idPerson;}

    public void setIdPerson(int idPerson) {this.idPerson = idPerson;}

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public String toString() {
        return "Comment{" +
                "idComment=" + idComment +
                ", content='" + content + '\'' +
                ", idUser=" + idUser +
                ", idBook=" + idBook +
                ", idPerson=" + idPerson +
                '}';
    }
}
