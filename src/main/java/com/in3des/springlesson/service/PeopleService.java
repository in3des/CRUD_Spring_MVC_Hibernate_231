package com.in3des.springlesson.service;

import com.in3des.springlesson.dao.PersonDAOImpl;
import com.in3des.springlesson.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PeopleService {

    public List<Person> index();

    public Person show(final int id);

    public void save(Person person);

    public void update(Person updatedPerson, int id);

    public void delete(int id);
}