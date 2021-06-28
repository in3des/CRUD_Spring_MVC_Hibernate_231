package com.in3des.springlesson.dao;

import com.in3des.springlesson.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

//@Component
//@Transactional
@Repository
public interface PersonDAO {

    public List<Person> index();

    public Person show(final int id);

    public void save(Person person);

    public void update(Person updatedPerson, int id);

    public void delete(int id);


}

