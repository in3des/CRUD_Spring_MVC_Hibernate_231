package com.in3des.springlesson.dao;

import com.in3des.springlesson.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
//@Transactional
@Repository
public interface PersonDAO {

    public List<Person> index();

    public Person show(final Long id);

    public void save(Person person);

    public void update(Person updatedPerson, Long id);

    public void delete(Long id);


}

