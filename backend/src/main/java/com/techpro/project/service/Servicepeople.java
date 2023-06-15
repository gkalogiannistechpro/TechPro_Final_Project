package com.techpro.project.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.techpro.project.entity.People;

@Service
public interface Servicepeople {

    // Save operation
    
    People savePeople(People people);

    // Read operation
   People readPeople(int id);
    
}
