package com.in3des.springlesson.dao;

import com.in3des.springlesson.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;

//@Component
@Service
public class PersonDAO {

    @PersistenceContext // or even @Autowired
    private EntityManager em;

//    public static EntityManager getEntityManager() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.in3des.springlesson.entity");
//        return emf.createEntityManager();
//    }



    public List<Person> index() {
//        EntityManager em = getEntityManager();
        return em.createNativeQuery("SELECT * FROM Person").getResultList();
//        List<Person> people = em.createQuery("SELECT person FROM Person where ")
//                .setParameter(1, "English")
//                .getResultList();
//        return personRepository.findAll();
//        return people;

//        return jdbcTemplate.query("SELECT * FROM Person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person show(final int id) {
//        EntityManager em = getEntityManager();
        Person person = em.find(Person.class, id);
//        em.detach(person);
        return person;
//        return personRepository.getById(id);
//        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class)).stream().findAny().orElse(null);
    }

    public void save(Person person) {
        em.persist(person);
//        personRepository.save(person);
//        jdbcTemplate.update("INSERT INTO Person VALUES (1, ?, ?, ?)", person.getName(), person.getSurname(), person.getAge());
    }

    public void update(Person updatedPerson, int id) {
        Person person = em.find(Person.class, id);
        person.setName(updatedPerson.getName());
        person.setSurname(updatedPerson.getSurname());
        person.setAge(updatedPerson.getAge());
        em.getTransaction().commit();

//        personRepository.
//        jdbcTemplate.update("UPDATE Person SET name=?, surname=?, age=? WHERE id=?", updatedPerson.getName(), updatedPerson.getSurname(),
//                updatedPerson.getAge(), id);
    }

    public void delete(int id) {
        Person person = em.find(Person.class, id);
        em.remove(person);
//        personRepository.getById(id);
//        jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
    }


}

