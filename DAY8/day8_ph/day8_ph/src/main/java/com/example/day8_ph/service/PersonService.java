package com.example.day8_ph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day8_ph.model.Person;
import com.example.day8_ph.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    private PersonRepo rep;

    public boolean post(Person person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Person> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<Person> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}
