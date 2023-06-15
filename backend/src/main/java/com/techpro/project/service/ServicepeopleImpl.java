package com.techpro.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techpro.project.entity.People;
import com.techpro.project.repository.PeopleRepository;

@Component
public class ServicepeopleImpl implements Servicepeople {

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    public People savePeople(People people) {
        
        return peopleRepository.save(people);
    }

    @Override
    public People readPeople(int id) {
        return null;
        
        
    }


    
}
