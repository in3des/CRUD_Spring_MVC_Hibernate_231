package com.in3des.springlesson.dao;

import com.in3des.springlesson.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
//@PropertySource("classpath:db.properties")
public class PersonDAO {

//    @Autowired
//    private static Environment env;

    private static int PEOPLE_ID;

    private static Connection connection;

    private static String url="jdbc:mysql://localhost:3306/hiber_231?verifyServerCertificate=false&useSSL=false&requireSSL=false&useLegacyDatetimeCode=false&amp&serverTimezone=UTC";
    private static String username="root";
    private static String password="root";

//    static {
//        try {
//            connection = DriverManager.getConnection(env.getProperty("db.url"), env.getProperty("db.username"), env.getProperty("db.password"));
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Person> index() {
        List<Person> people = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setSurname(resultSet.getString("surname"));
                person.setId(resultSet.getInt("age"));

                people.add(person);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return people;
    }

    public Person show(final int id) {
//        return people.stream().filter(x -> x.getId() == id).findAny().orElse(null);
        return null;
    }

    public void save(Person person) {
//        person.setId(++PEOPLE_ID);
//        people.add(person);

        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO Person VALUES(" + 1 + ",'" + person.getName() +
                    "','" + person.getSurname() + "'," + person.getAge() + ")";
            statement.executeUpdate(SQL);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void update(Person updatedPerson, int id) {
//        Person personToUpdate = show(id);
//        personToUpdate.setName(updatedPerson.getName());
//        personToUpdate.setSurname(updatedPerson.getSurname());
//        personToUpdate.setAge(updatedPerson.getAge());
    }

    public void delete(int id) {
//        people.removeIf(x -> x.getId() == id);
    }

}

