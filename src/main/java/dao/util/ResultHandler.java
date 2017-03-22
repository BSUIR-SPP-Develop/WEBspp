package dao.util;

import bean.Result;
import bean.entity.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by dmirry on 02.03.17.
 */
public class ResultHandler {


    public static Result getResult(ArrayList<ArrayList> results) {
        Result result = new Result();
        for (ArrayList temp : results) {
            for (Object object : temp) {
                result.addElement(object);
            }
        }
        return result;
    }

    public static ArrayList authorElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Author author = new Author();
            author.setFullName(resultSet.getString("full_name"));
            author.setIdAuthor(resultSet.getInt("id_author"));
            temp.add(author);
        }

        return temp;
    }/*

    public static ArrayList bookElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Book book = new Book();
            //book.setIdAuthor(resultSet.getInt("id_author"));
            book.setCountOfPages(resultSet.getInt("CountOfPages"));
            book.setDescription(resultSet.getString("description"));
            book.setIdBook(resultSet.getInt("idBook"));
            book.setLanguage(resultSet.getString("language"));
            book.setPublisher(resultSet.getString("Publisher"));
            book.setYearOfPublishing(resultSet.getDate("YearOfPublishing"));
            temp.add(book);
        }

        return temp;
    }

    public static ArrayList claimElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Claim claim = new Claim();
            claim.setIdBook(resultSet.getInt("Book_idBook"));
            claim.setIdClaim(resultSet.getInt("idClaim"));
            claim.setIdUser(resultSet.getInt("User_idUser"));
            temp.add(claim);
        }

        return temp;
    }

    public static ArrayList commentElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Comment comment = new Comment();
            comment.setIdBook(resultSet.getInt("id_book"));
            comment.setIdUser(resultSet.getInt("user"));
            comment.setContent(resultSet.getString("content"));
            comment.setIdComment(resultSet.getInt("comment"));
            temp.add(comment);
        }

        return temp;
    }

    public static ArrayList newsElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            News news = new News();
            news.setContent(resultSet.getString("content"));
            news.setDescription(resultSet.getString("description"));
            news.setIdUser(resultSet.getInt("id_user"));
            news.setDate(resultSet.getDate("date"));
            news.setIdNews(resultSet.getInt("id_news"));
            temp.add(news);
        }

        return temp;
    }

    public static ArrayList personElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Person person = new Person();
            person.setContactInfo(resultSet.getString("contact_info"));
            person.setFullName(resultSet.getString("full_name"));
            person.setIdPerson(resultSet.getInt("id_person"));
            person.setPhone(resultSet.getString("phone"));
            temp.add(person);
        }

        return temp;
    }

    public static ArrayList returnStatmenetElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            ReturnStatement returnStatement = new ReturnStatement();
            returnStatement.setIdUser(resultSet.getInt("id_user"));
            returnStatement.setIdBook(resultSet.getInt("id_book"));
            returnStatement.setIdClaim(resultSet.getInt("id_claim"));
            returnStatement.setIdReturn(resultSet.getInt("id_return"));
            temp.add(returnStatement);
        }

        return temp;
    }

    public static ArrayList statucDiscriptionElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            StatusDescription statusDescription = new StatusDescription();
            statusDescription.setIdBook(resultSet.getInt("id_book"));
            statusDescription.setDataTime(resultSet.getDate("date_time"));
            statusDescription.setIdStatement(resultSet.getInt("id_statement"));
            statusDescription.setMarkOfContidion(resultSet.getString("mark_of_condition"));
            temp.add(statusDescription);
        }

        return temp;
    }

    public static ArrayList userElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            User user = new User();
            user.setIdPerson(resultSet.getInt("id_person"));
            user.setIdClaim(resultSet.getInt("id_claim"));
            user.setEmail(resultSet.getString("email"));
            user.setIdUser(resultSet.getInt("id_user"));
            user.setLogin(resultSet.getString("login"));
            user.setPassword(resultSet.getString("password"));
            user.setRole(resultSet.getString("role"));
            temp.add(user);
        }

        return temp;
    }*/
}
