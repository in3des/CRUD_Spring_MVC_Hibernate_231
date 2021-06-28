package com.in3des.springlesson.service;

import com.in3des.springlesson.dao.PersonDAO;
import com.in3des.springlesson.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    private final PersonDAO personDAO;

    @Autowired
    public PeopleServiceImpl(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    @Transactional
    public List<Person> index() {
        return this.personDAO.index();
    }

    @Override
    @Transactional
    public Person show(final Long id) {
        return this.personDAO.show(id);
    }

    @Override
    @Transactional
    public void save(Person person) {
        this.personDAO.save(person);
    }

    @Override
    @Transactional
    public void update(Person updatedPerson, Long id) {
        this.personDAO.update(updatedPerson, id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        this.personDAO.delete(id);
    }
}