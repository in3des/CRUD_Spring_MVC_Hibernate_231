package com.in3des.springlesson.dao;

import com.in3des.springlesson.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_ID;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_ID, "Victor"));
        people.add(new Person(++PEOPLE_ID, "George"));
        people.add(new Person(++PEOPLE_ID, "Huston"));
        people.add(new Person(++PEOPLE_ID, "Sara"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(final int id) {
        return people.stream().filter(x -> x.getId() == id).findAny().orElse(null);
    }

}

