package com.in3des.springlesson.dao;

import com.in3des.springlesson.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
//@PropertySource("classpath:db.properties")
public class PersonDAO {

    private final JdbcTemplate jdbcTemplate;

//    @Autowired
//    private static Environment env;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
        return jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person show(final int id) {
        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class)).stream().findAny().orElse(null);
    }

    public void save(Person person) {
        jdbcTemplate.update("INSERT INTO Person VALUES (1, ?, ?, ?)", person.getName(), person.getSurname(), person.getAge());
    }

    public void update(Person updatedPerson, int id) {
        jdbcTemplate.update("UPDATE Person SET name=?, surname=?, age=? WHERE id=?", updatedPerson.getName(), updatedPerson.getSurname(),
                updatedPerson.getAge(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
    }


}

