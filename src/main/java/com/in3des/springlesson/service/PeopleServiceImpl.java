//package com.in3des.springlesson.service;
//
//import com.in3des.springlesson.dao.PersonDAO;
//import com.in3des.springlesson.entity.Person;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//public class PeopleServiceImpl implements PeopleService {
//
//    private final PersonDAO personDAO;
//
//    public PeopleServiceImpl(PersonDAO personDAO) {
//        this.personDAO = personDAO;
//    }
//
//    @Override
////    @Transactional
//    public List<Person> index() {
//        return personDAO.index();
//    }
//
//    @Override
////    @Transactional
//    public Person show(final Long id) {
//        return personDAO.show(id);
//    }
//
//    @Override
//    @Transactional
//    public void save(Person person) {
//        personDAO.save(person);
//    }
//
//    @Override
//    @Transactional
//    public void update(Person updatedPerson, Long id) {
//        personDAO.update(updatedPerson, id);
//    }
//
//
//    @Transactional
//    @Override
//    public void delete(Long id) {
//        personDAO.delete(id);
//    }
//}