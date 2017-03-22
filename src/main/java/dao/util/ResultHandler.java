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
    }

    public static ArrayList bookElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Book book = new Book();
            book.setIdAuthor(resultSet.getInt("id_author"));
            book.setCountOfPages(resultSet.getInt("count_of_pages"));
            book.setDescription(resultSet.getString("description"));
            book.setIdBook(resultSet.getInt("id_book"));
            book.setLanguage(resultSet.getString("language"));
            book.setPublisher(resultSet.getString("publisher"));
            book.setYearOfPublishing(resultSet.getDate("year_of_publishing"));
            temp.add(book);
        }

        return temp;
    }

    public static ArrayList claimElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Claim claim = new Claim();
            claim.setIdClaim(resultSet.getInt("id_claim"));
            claim.setIdBook(resultSet.getInt("id_book"));
            claim.setIdUser(resultSet.getInt("id_user"));
            claim.setIdPerson(resultSet.getInt("id_person"));
            claim.setBookStatusDescription(resultSet.getInt("book_status_descrition"));
            temp.add(claim);
        }

        return temp;
    }

    public static ArrayList commentElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            Comment comment = new Comment();
            comment.setIdComment(resultSet.getInt("id_comment"));
            comment.setIdBook(resultSet.getInt("id_book"));
            comment.setIdUser(resultSet.getInt("id_user"));
            comment.setContent(resultSet.getString("content"));
            comment.setIdPerson(resultSet.getInt("id_person"));
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
            news.setIdPerson(resultSet.getInt("id_person"));
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
            returnStatement.setIdReturnStatement(resultSet.getInt("id_return_statement"));
            returnStatement.setStatus(resultSet.getInt("status"));
            returnStatement.setIdStatusDescription(resultSet.getInt("id_status_description"));
            returnStatement.setIdBook(resultSet.getInt("id_book"));
            returnStatement.setIdClaim(resultSet.getInt("id_claim"));

            temp.add(returnStatement);
        }

        return temp;
    }

    public static ArrayList statucDiscriptionElements(ResultSet resultSet) throws SQLException {
        ArrayList temp = new ArrayList();

        while (resultSet.next()) {
            StatusDescription statusDescription = new StatusDescription();
            statusDescription.setIdStatusDescription(resultSet.getInt("id_status_description"));
            statusDescription.setDateOfEvalution(resultSet.getDate("date_of_evalution"));
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
            user.setEmail(resultSet.getString("email"));
            user.setIdUser(resultSet.getInt("id_user"));
            user.setLogin(resultSet.getString("login"));
            user.setPassword(resultSet.getString("password"));
            user.setRole(resultSet.getString("role"));
            temp.add(user);
        }

        return temp;
    }
}
