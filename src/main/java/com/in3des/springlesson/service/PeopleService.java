//package com.in3des.springlesson.service;
//
//import com.in3des.springlesson.dao.PersonDAO;
//import com.in3des.springlesson.entity.Person;
//import com.in3des.springlesson.repository.PersonRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
////@Service
//public class PeopleService {
//
//    private PersonDAO personDAO;
//
////    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.in3des.springlesson.entity");
////    EntityManager em = emf.createEntityManager();
//
////    private final PersonRepository personRepository;
//
////    @Autowired
////    public PeopleService(PersonRepository personRepository) {
////        this.personRepository = personRepository;
////    }
//
//    public List<Person> index() {
//        return personDAO.findAll();
//    }
//
//    public Person show(final int id) {
//        return personRepository.getById(id);
//    }
//
//    public void save(Person person) {
//        personRepository.save(person);
//    }
//
//    public void update(Person updatedPerson, int id) {
//        personRepository.save(updatedPerson);
//    }
//
//    public void delete(int id) {
//        personRepository.getById(id);
//    }
//}