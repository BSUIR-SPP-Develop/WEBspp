package bean.entity;

import java.util.Date;

/**
 * Created by dmirry on 05.03.17.
 */
public class News {
    int idNews;
    String content;
    String description;
    Date date;
    int idUser;

    @Override
    public String toString() {
        return "News{" +
                "idNews=" + idNews +
                ", content='" + content + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", idUser=" + idUser +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (idNews != news.idNews) return false;
        if (idUser != news.idUser) return false;
        if (content != null ? !content.equals(news.content) : news.content != null) return false;
        if (description != null ? !description.equals(news.description) : news.description != null) return false;
        return date != null ? date.equals(news.date) : news.date == null;
    }

    @Override
    public int hashCode() {
        int result = idNews;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + idUser;
        return result;
    }

    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
