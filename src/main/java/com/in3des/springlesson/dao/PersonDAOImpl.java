package com.in3des.springlesson.dao;

import com.in3des.springlesson.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class PersonDAOImpl implements PersonDAO {

    @PersistenceContext // or even @Autowired
    private EntityManager em;

    @Override
    public List<Person> index() {
        return em.createNativeQuery("SELECT * FROM Person", Person.class).getResultList();
    }

    @Override
    public Person show(final int id) {
        Person person = em.find(Person.class, id);
        return person;
    }

    @Override
    public void save(Person person) {
//        em.getTransaction().begin();
        em.persist(person);
//        em.getTransaction().commit();
//        em.close();
    }

//    @Transactional
    @Override
    public void update(Person updatedPerson, int id) {
//        em.getTransaction().begin();
        Person person = em.find(Person.class, id);
        person.setName(updatedPerson.getName());
        person.setSurname(updatedPerson.getSurname());
        person.setAge(updatedPerson.getAge());
        em.merge(person);
//        em.getTransaction().commit();
//        em.close();
    }

//    @Transactional
    @Override
    public void delete(int id) {
//        em.getTransaction().begin();
        Person person = em.find(Person.class, id);
        em.remove(person);
//        em.getTransaction().commit();
//        em.close();
    }


}

